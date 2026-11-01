package Collectionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Double, String> n= new TreeMap<>();
		n.put(5.2, "Orange");
		n.put(3.4, "apple");
		n.put(6.2,"Rose");
		n.put(3.2, "Rosre");
		System.out.println(n);
		
		//remove
		n.remove(5.2);
		System.out.println(n);
		
		//reterive
		System.out.println(n.get(6.2));
		
		//display key alone
		System.out.println(n.keySet());
						
		Hashtable<Float, Character> n1= new Hashtable<>();
		n1.put(5.2f, 'O');
		n1.put(3.4f, 'a');
		n1.put(6.2f,'R');
		n1.put(3.2f, 'e');
		System.out.println(n1);
		
		//remove
		
		n1.remove(5.2f);
		System.out.println(n1);
		
		//reterive
		
		
		System.out.println(n1.get(6.2f));
		
		//display key alone
		
		System.out.println(n.values());
	}

}
