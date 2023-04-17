package snippetquestion2;

public class Override {
    public static void main(String[] args) {
        Sub subClass = new Sub();
        System.out.println(subClass.publicMethod());   
        System.out.println(subClass.protectedMethod()); 
        System.out.println(subClass.defaultMethod());
        subClass.privateMethod();
    }
}

class Super{
	public String publicMethod() {
        return "Public Method";
    }
    protected String protectedMethod() {
        return "Protected Method";
    }
    String defaultMethod() {
        return "Default Method";
    }
    private String privateMethod() {
        return "Private Method";
    }
}
class Sub extends Super {
	public String publicMethod() {
        return "Overriden Public Method";
    }
    protected String protectedMethod() {
        return "OverridenProtected Method";
    }
    String defaultMethod() {
        return "OverridenDefault Method";
    }
    private String privateMethod() {
        return "Overriden Private Method";
    }
}
