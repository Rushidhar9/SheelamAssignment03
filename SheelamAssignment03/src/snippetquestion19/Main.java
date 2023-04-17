package snippetquestion19;

public class Main {

	public static void main(String[] args) {
		Demo runnable = new Demo();
		Thread t1 = new Thread(runnable);
		t1.start();

	}

}
class Demo implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
}

