package snippetquestion9;
import java.io.*;
public class tryResource {
	 public static void main(String[] args) {
	 try (FileInputStream stream = new FileInputStream("myfile.txt");
		  BufferedReader br = new BufferedReader(new InputStreamReader(stream))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }

		} catch (IOException e) {
		    System.err.println("An error occurred: " + e.getMessage());
		}
}
}
