package it.carrefour.accenture.readFile.thread;

import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Stream;

public class Producer implements Runnable{

    private BlockingQueue<Path> queue = null;
    private Stream<Path> path = null;

    public Producer(BlockingQueue<Path> queue,Stream<Path> path) {
        this.queue = queue;
        this.path=path;
    }

    public void run() {
        path.forEach(p -> {
			try {
				queue.put(p);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
    }
}