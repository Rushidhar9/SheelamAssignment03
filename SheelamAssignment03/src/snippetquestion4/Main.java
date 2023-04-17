package snippetquestion4;

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        Override b = new Derived();
         b.privateMethod();
         d.staticMethod();
         Override.staticMethod();
    }
}
class Override {
	    private void privateMethod() {
	        System.out.println("Printing  private method");
	    }
	    public static void staticMethod() {
	        System.out.println("Printing  static method");
	    }
	}
class Derived extends Override {
	    private void privateMethod() {
	        System.out.println("Printing Derived private method");
	    }
	    public static void staticMethod() {
	        System.out.println("Printing Derived static method");
	    }
	}
 

