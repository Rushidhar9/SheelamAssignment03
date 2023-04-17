package snippetquestion16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> m = new HashMap<>();
		m.put("Rushi", 1);
		m.put("Reddy", 2);
		m.put("Sheelam", 3);
		int value = m.get("Sheelam");
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
		    String key = entry.getKey();
		    int val = entry.getValue();
		    System.out.println(key + " => " + val);
		}
	}

}
