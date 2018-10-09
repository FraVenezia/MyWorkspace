package it.begear.serviceRest.rest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import it.carrefour.accenture.readFile.thread.WorkerThread;

@Path(value = "/thread")
public class SimpleThreadPool {

	@GET
	@Path("/get")
    public void execute() {
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

}
