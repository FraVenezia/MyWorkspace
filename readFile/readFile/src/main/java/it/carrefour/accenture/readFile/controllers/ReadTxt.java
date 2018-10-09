package it.carrefour.accenture.readFile.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.carrefour.accenture.readFile.thread.Consumer;
import it.carrefour.accenture.readFile.thread.Producer;
import it.carrefour.accenture.readFile.thread.WorkerThread;

@RestController
public class ReadTxt {

	@GetMapping("hello")
	public String hello() {
		return "Ci sono";
	}

	@GetMapping("go")
	public String execute() {
		Stream<Path> path = null;
		try {
			path = Files.walk(Paths.get("C:\\FileService")).filter(p -> p.toString().endsWith(".txt")).distinct();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BlockingQueue<Path> blockingQueue = new LinkedBlockingDeque<>(3);
		ExecutorService executor = Executors.newFixedThreadPool(5);

        Producer producer = new Producer(blockingQueue,path);
        Consumer consumer = new Consumer(blockingQueue,executor);
        new Thread(producer).start();
        new Thread(consumer).start();
    	
        executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
		
// Comunicazione tra ThreadPool e BlockingQuo
		//Spirng Batch
		
//		ExecutorService executor = Executors.newFixedThreadPool(5);
//		path.forEach(p -> {
//			Runnable worker = new WorkerThread(p);
//			executor.execute(worker);
//		});
//		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
//		System.out.println("Finished all threads");

		return "OK";
	}
}
