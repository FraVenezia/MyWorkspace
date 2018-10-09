package it.carrefour.accenture.readFile.thread;



public class WorkerThread implements Runnable {

	private String command;

	public WorkerThread(String p) {
		this.command = p;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + command);
	}

//    public WorkerThread(Path p){
//        this.command=p;
//    }
//
//    public void run() {
//    	Stream<String> record=null;
//    	try {
//			record=Files.lines(command);
//			record.forEach(r -> {
//				System.out.println(Thread.currentThread().getName()+" "+r);
//			});
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//        
//    }

//    private void processCommand() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

}
