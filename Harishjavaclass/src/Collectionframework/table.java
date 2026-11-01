package Collectionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Hashmap : every run different order
//Hashtable : maintain First order 

 Hashtable<Integer, String> n= new Hashtable<>();
	n.put(5, "Orange");
	n.put(3, "apple");
	n.put(6,"Rose");
	n.put(32, "Rosre");
	System.out.println(n);
	
	//remove
	n.remove(6);
	System.out.println(n);
	
	//reterive
	
	System.out.println(n.get(3));
	
	//Print Element or Values
	
	System.out.println(n.keySet());
	System.out.println(n.values());
	}

}
