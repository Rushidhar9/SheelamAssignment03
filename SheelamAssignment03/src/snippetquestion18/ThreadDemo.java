package snippetquestion18;

public class ThreadDemo {
	public static void main(String[] args) {
	Thread tr = new Thread(() -> {
	    System.out.println("Thread started.");
	});
	tr.start();
	try {
	    tr.start();
	} catch (IllegalThreadStateException e) {
	    System.out.println("started thread twice");
	}

	}
}
