package snippetquestion20;

public class ThreadDemo implements Runnable {

		   public void run() {
		      System.out.println("Thread is running");
		   }

		   public static void main(String[] args) throws InterruptedException {
		      Thread thread = new Thread(new ThreadDemo());
		      System.out.println("Thread state: " + thread.getState());
		      thread.start();
		      System.out.println("Thread state: " + thread.getState());
		      Thread.sleep(999);
		      System.out.println("Thread state: " + thread.getState());
		      thread.join();
		      System.out.println("Thread state: " + thread.getState());
		   }
		}
