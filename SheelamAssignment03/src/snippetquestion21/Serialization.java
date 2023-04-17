package snippetquestion21;
import java.io.*;
public class Serialization {
	
	    public static void main(String[] args) {
	        Person person = new Person("Adam", 22);

	        try {
	          
	            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("person.ser"));
	            stream.writeObject(person);
	            stream.close();
	            System.out.println("Object has been serialized");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	class Person implements Serializable {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}



