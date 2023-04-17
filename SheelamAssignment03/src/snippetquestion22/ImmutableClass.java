package snippetquestion22;

public final class ImmutableClass {
	    private final int intValue;
	    private final String name;

	    public ImmutableClass(int value, String name) {
	        this.intValue = value;
	        this.name = name;
	    }

	    public int getValue() {
	        return intValue;
	    }

	    public String getName() {
	        return name;
	    }
	}

