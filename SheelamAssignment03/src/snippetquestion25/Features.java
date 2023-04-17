package snippetquestion25;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Features {
	public static void main(String[] args) {
		//lamda exp
		List<Integer> values = Arrays.asList(3,1,4,1,5,9,2,6,5,3);
		Collections.sort(values, (a, b) -> a.compareTo(b));
		System.out.println(values);
		
		//streams
		List<String> listWords = Arrays.asList("hello", "world", "how", "are", "you");
		List<String> filteredWords = listWords.stream() .filter(s -> s.length() > 3).collect(Collectors.toList());
		System.out.println(filteredWords);
		
		//Method references
		List<String> words1 = Arrays.asList("hello", "world", "how", "are", "you");
		List<String> upperCaseWords = listWords.stream()
		        .map(String::toUpperCase)
		        .collect(Collectors.toList());
		System.out.println(upperCaseWords);
		
		//Optional
		Optional<String> optionalString = Optional.of("hello");
		if (optionalString.isPresent()) {
		    String s = optionalString.get();
		    System.out.println(s);
		}
		optionalString.ifPresent(System.out::println);
		
		//Date and Time
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = now.format(formatter);

		System.out.println(formattedDateTime);

		}

	}
//Functional Interfaces
 interface Predicate<T> {
    boolean test(T t);
Predicate<String> isEmpty = s -> s.isEmpty();
}
	//Default methods
 interface MyInterface {
	    default void myMethod() {
	        System.out.println("Hello, world!");
	    	MyInterface obj = new MyInterface() {};
	    	obj.myMethod();
	    }
	}


