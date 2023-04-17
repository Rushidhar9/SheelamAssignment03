package snippetquestion17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("good morning");
		list.add("all");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
		    String e = it.next();
		    list.remove(0);
		}
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("Good", 1);
		map.put("night", 2);
		map.put("all", 3);
		Iterator<Integer> it1 = map.values().iterator();
		while (it1.hasNext()) {
		    Integer ele = it1.next();
		    map.put("HII", 4);
		}


	}

}