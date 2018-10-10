package it.accenture.batch;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.partition.support.MultiResourcePartitioner;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.builder.MultiResourceItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.separator.DefaultRecordSeparatorPolicy;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.support.ClassifierCompositeItemWriter;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.classify.BackToBackPatternClassifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	Logger logger = LoggerFactory.getLogger(BatchConfiguration.class);
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	// tag::readerwriterprocessor[]
//	@Value("file:///C:/FileService/**/*.csv")   //Se i file sono sotto un unico path, anche sottodirectory
//	private Resource[] inputResources;
//	@Value("file:///C:/FileService/Lista1/*.csv")
//	private Resource[] inputResources1;
//	@Value("file:///C:/FileService/Lista2/*.csv")
//	private Resource[] inputResources2;
//	@Value("file:///C:/FileService/Lista3/*.csv")
//	private Resource[] inputResources3;
//
//	@Bean
//	public MultiResourceItemReader<Record> multiResourceItemReader() {
//		return new MultiResourceItemReaderBuilder<Record>().name("readMultiFile").resources(inputResources1)
//				.resources(inputResources2).resources(inputResources3).delegate(reader()).build();
//	}

//	@Bean
//	public FlatFileItemReader<Record> reader() {
//		return new FlatFileItemReaderBuilder<Record>().name("recordItemReader")
//				.recordSeparatorPolicy(new DefaultRecordSeparatorPolicy()).linesToSkip(1)
//				.lineMapper(new DefaultLineMapper<Record>() {
//					{
//						setLineTokenizer(new DelimitedLineTokenizer() {
//							{
//								setStrict(true);
//								setNames(new String[] { "permalink", "company", "numEmps", "category", "city", "state",
//										"fundedDate", "raisedAmt", "raisedCurrency", "round" });
//							}
//						});
//						setFieldSetMapper(new BeanWrapperFieldSetMapper<Record>() {
//							{
//								setTargetType(Record.class);
//							}
//						});
//					}
//				}).build();
//	}

	@Bean
	@StepScope
	public FlatFileItemReader<Record> reader(@Value("#{stepExecutionContext['fileName']}") String file) {
		try {
			return new FlatFileItemReaderBuilder<Record>().name("recordItemReader").resource(new UrlResource(file))
					.recordSeparatorPolicy(new DefaultRecordSeparatorPolicy()).linesToSkip(1)
					.lineMapper(new DefaultLineMapper<Record>() {
						{
							setLineTokenizer(new DelimitedLineTokenizer() {
								{
									setStrict(true);
									setNames(new String[] { "permalink", "company", "numEmps", "category", "city", "state",
											"fundedDate", "raisedAmt", "raisedCurrency", "round" });
								}
							});
							setFieldSetMapper(new BeanWrapperFieldSetMapper<Record>() {
								{
									setTargetType(Record.class);
								}
							});
						}
					}).build();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Bean
	public RecordProcessor processor() {
		return new RecordProcessor();
	}

//	@Bean()
//	public ClassifierCompositeItemWriter<Record> classifierCompositeItemWriter(){
//		return new ClassifierCompositeItemWriterBuilder<Record>()
//				.classifier(new BackToBackPatternClassifier<String,String>(){
//					{
//						setRouterDelegate(new WriterRouteImpl());
//						setMatcherMap(new HashMap<String,String>());
//					}
//				})
//				.build(); 
//	};

//	@Bean
//	public FlatFileItemWriter<Record> writer() {
//		try {
//			return new FlatFileItemWriterBuilder<Record>().name("recordItemWriter")
//					.resource(new UrlResource("file:///C:/Users/utente/Desktop/ListaMod.csv"))
//					.lineAggregator(new DelimitedLineAggregator<Record>() {
//						{
//							setDelimiter(",");
//							setFieldExtractor(new BeanWrapperFieldExtractor<Record>() {
//								{
//									setNames(new String[] { "permalink", "company", "numEmps", "category", "city",
//											"state", "fundedDate", "raisedAmt", "raisedCurrency", "round" });
//								}
//							});
//						}
//					}).shouldDeleteIfEmpty(true).shouldDeleteIfExists(true).build();
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
	@Bean
    public ItemWriter<Record> writer() {
        return (items) -> items.forEach(item -> {
        	logger.info(item.getCategory());
           });
    }
	// end::readerwriterprocessor[]

	// tag::jobstep[]
	@Bean
	public Job importUserJob(JobCompletionNotificationListener listener) {
		return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer()).listener(listener).flow(masterStep())
				.end().build();
	}

//	@Bean
//	public Step step1() {
//		return stepBuilderFactory.get("step1").<Record, Record>chunk(5).reader(reader())
//				.processor(processor()).writer(writer()).build();
//	}

	@Bean
	public Step masterStep() {
		try {
			return stepBuilderFactory.get("masterStep").partitioner(slaveStep()).partitioner("partition", partitioner(null))
					.gridSize(10).taskExecutor(new SimpleAsyncTaskExecutor()).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	 
	
	@Bean
	@JobScope
	public Partitioner partitioner(@Value("#{jobParameters['resource']}") String resource){
		MultiResourcePartitioner partitioner = new MultiResourcePartitioner();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		try {
			partitioner.setResources(resolver.getResources(resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return partitioner;

	}

	@Bean
	public Step slaveStep() throws Exception {
		return stepBuilderFactory.get("slaveStep").<Record, Record>chunk(1).reader(reader(null)).writer(writer())
				.build();
	}

	// end::jobstep[]
}
