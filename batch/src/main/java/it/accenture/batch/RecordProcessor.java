package it.accenture.batch;

import org.springframework.batch.item.ItemProcessor;

public class RecordProcessor implements ItemProcessor<Record,Record> {
	
	@Override
	public Record process(final Record record) throws Exception {
		final Record transformedRecord = record;
        return transformedRecord;
    }


}
