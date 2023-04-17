package snippetquestion12;
public class finalFinallyFinalize {
	    private final int i;
	    public finalFinallyFinalize(int value) {
	        this.i = value;
	    }
	    public int getValue() {
	        return i;
	    }
	    public static void main(String[] args) {
	    	finalFinallyFinalize ex = null;
	        try {
	        	ex = new finalFinallyFinalize(25);
	            System.out.println("integer value: " + ex.getValue());
	        } catch (Exception ep) {
	            System.out.println("Exception: " + ep.getMessage());
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	        ex = null;
	        System.gc();
	        System.out.println("End of program.");
	    }
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Finalize method called.");
	        super.finalize();
	    }
	}


