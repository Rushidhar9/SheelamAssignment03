package snippetquestion6;
	public class StringClassStringBuffer {
	    public static void main(String[] args) {
	        String s = "Hello";
	        StringBuffer sb = new StringBuffer("Hello");
	        s.concat(" World");
	        System.out.println(s);
	        sb.append(" World");
	        System.out.println(sb.toString());
	    }
	}

