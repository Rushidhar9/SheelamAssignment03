package snippetquestion5;
	public class StringBufferStringBuilder {
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer();
	        StringBuilder sbd = new StringBuilder();
	        synchronized (sb) {
	        	sb.append("Hi");
	        	sb.append(" ");
	        	sb.append("Buffer");
	            System.out.println(sb.toString());
	        }
	        sbd.append("Hi");
	        sbd.append(" ");
	        sbd.append("Builder");
	        System.out.println(sbd.toString());
	    }
	}

