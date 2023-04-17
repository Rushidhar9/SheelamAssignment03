package snippetquestion19;

public class DemoMain{
	public static void main(String[] args) {
		ThreadStart t1 = new ThreadStart();
		t1.start();

	}
}
class ThreadStart extends Thread {
	
    public void run() {
	        System.out.println("SecondThread running");
	    }
	
}



