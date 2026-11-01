package Collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*map: container where elements will be stored along with its key
		 * key: any datatype
		 * element: any datatype
		 * add
		 * remove
		 * retrive
		 * 
		 * TreeMap: keys: alphabetical/ascending order
		 * LinkedHashmap: insertion order
		 * Hashmap: unpredictable order
		 * 
		 * TreeMap<Datatypeofkey, datatypeofelement> name= new TreeMap<>();
		 * 
		 * 
		 * */
		TreeMap<Integer, String> n= new TreeMap<>();
		n.put(5, "Orange");
		n.put(3, "apple");
		n.put(6,"Rose");
		n.put(32, "Rosre");
		System.out.println(n);
		
		LinkedHashMap<Integer, String> n1= new LinkedHashMap<>();
		n1.put(5, "Orange");
		n1.put(3, "apple");
		n1.put(6,"Rose");
		n1.put(0, "Empty");
		System.out.println(n1);
		
		HashMap<Integer, String> n11= new HashMap<>();
		n11.put(5, "Orange");
		n11.put(3, "apple");
		n11.put(6,"Rose");
		n11.put(0, "Empty");
		System.out.println(n11);
		
	}

}
