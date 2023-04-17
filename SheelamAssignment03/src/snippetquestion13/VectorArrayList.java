package snippetquestion13;
import java.util.*;
public class VectorArrayList {
	    public static void main(String[] args) {
	        Vector<Integer> vc = new Vector<>();
	        vc.add(11);
	        vc.add(22);
	        vc.add(33);
	        ArrayList<Integer> ar = new ArrayList<>();
	        ar.add(71);
	        ar.add(72);
	        ar.add(73);
	        System.out.println("Vector: " + vc);
	        System.out.println("ArrayList: " + ar);
	        System.out.println("Vector size: " + vc.size());
	        System.out.println("ArrayList size: " + ar.size());
	        System.out.println("Vector capacity: " + vc.capacity());
	        System.out.println("ArrayList capacity: " + ar.size());
	        vc.addElement(37);
	        ar.add(78);
	        System.out.println("Vector: " + vc);
	        System.out.println("ArrayList: " + ar);
	    }
	}


