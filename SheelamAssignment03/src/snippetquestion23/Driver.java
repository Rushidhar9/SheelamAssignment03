package snippetquestion23;

public class Driver {
	public static void main(String[] args) {
    ImmutableThreadSafe immutableObj = new ImmutableThreadSafe(10);

    Runnable task = () -> {
        System.out.println(immutableObj.getValue());
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

}

}
