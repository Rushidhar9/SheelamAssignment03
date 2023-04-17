package snippetquestion10;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ThrowsClause {
	    public void my1() throws IOException {
	    	
	    }
	}
	class Subclass extends ThrowsClause {
		
	    public void my1() throws FileNotFoundException {
	    
	     }
	}
