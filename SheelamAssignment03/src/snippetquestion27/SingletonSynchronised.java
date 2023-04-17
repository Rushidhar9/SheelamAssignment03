package snippetquestion27;

public class SingletonSynchronised {
	    private static SingletonSynchronised VALUE;

	    private SingletonSynchronised() {}

	    public static synchronized SingletonSynchronised getInstance() {
	        if (VALUE == null) {
	        	VALUE = new SingletonSynchronised();
	        }
	        return VALUE;
	    }
	}

