package snippetquestion15;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class HashTableHashMap {
	public static void main(String[] args) {
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("HI", 10);
		table.put("hello", 11);
		table.put("bye", 12);
		int v = table.get("bye");
		for (Map.Entry<String, Integer> entry : table.entrySet()) {
		    System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("good", 13);
		map.put("night", 14);
		map.put("happy", 15);
		int v1 = map.get("good");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " => " + entry.getValue());
		}

	}

}
