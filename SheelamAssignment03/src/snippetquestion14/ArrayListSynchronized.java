package snippetquestion14;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class ArrayListSynchronized {
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		List<String> list1 = Collections.synchronizedList(new ArrayList<>());
		List<String> list2 = new CopyOnWriteArrayList<>();
		list.add("Rushi");
		list.add("Reddy");
		list1.add("Sheelam");
		list1.add("Pashi");
		list2.add("Car");
		list2.add("Bike");
		synchronized(list)
		{
		  Iterator<String> iterator = list.iterator();
		  while (iterator.hasNext())
		  {
		    System.out.println(iterator.next());
		  }
		}
		  Iterator<String> iterator1 = list1.iterator();
		  while (iterator1.hasNext())
		  {
		    System.out.println(iterator1.next());
		  }
		  Iterator<String> iterator2 = list2.iterator();
		  while (iterator2.hasNext())
		  {
		    System.out.println(iterator2.next());
		  }		
}
}
