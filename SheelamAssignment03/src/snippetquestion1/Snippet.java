package snippetquestion1;

public class Snippet<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
    	Snippet<String> s = new Snippet<>();
        s.setValue("Hi, 	Rushi");
        String stringValue = s.getValue();
        System.out.println(stringValue);

    }
}

