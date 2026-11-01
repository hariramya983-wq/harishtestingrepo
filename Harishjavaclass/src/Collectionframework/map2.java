package Collectionframework;

import java.util.TreeMap;

public class map2 {
public static void main(String[] args) {
	
	/*map: container where elements will be stored along with its key
	 * key: any datatype
	 * element: any datatype
	 * add
	 * remove
	 * retrive
	 * 
	 * TreeMap: keys: alphabetical/ascending order
	 * */
	TreeMap<Integer, String> n= new TreeMap<>();
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
