package snippetquestion23;

public class ImmutableThreadSafe {
	
	    private final int value;

	    public ImmutableThreadSafe(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
}
	



