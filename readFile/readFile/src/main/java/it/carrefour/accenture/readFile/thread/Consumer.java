package it.carrefour.accenture.readFile.thread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class Consumer implements Runnable {

	private BlockingQueue<Path> queue = null;
    private Executor executor=null;

	public Consumer(BlockingQueue<Path> queue,Executor executor) {
		this.queue = queue;
		this.executor=executor;
	}

	public void run() {
		Path path = null;
		Stream<String> line = null;
		try {
			while (true) {
				path = queue.take();
				line = Files.lines(path);
				line.forEach(l -> {
					Runnable worker = new WorkerThread(l);
					executor.execute(worker);
				});
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}