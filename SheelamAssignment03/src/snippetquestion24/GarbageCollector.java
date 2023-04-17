package snippetquestion24;

public class GarbageCollector {
	    public static void main(String[] args) {
	        
	        Object ob1 = new Object();
	        Object ob2 = new Object();
	        ob1 = null;
	        ob2 = null;
	        System.gc();
	    }
	}

