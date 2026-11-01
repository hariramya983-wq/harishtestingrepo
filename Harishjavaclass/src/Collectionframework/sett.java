package Collectionframework;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	/*set
		 //  not indexed
		// add
		//  remote
		//  cannot retrive
		// iteration
		// not accept duplicates
		//  
		//  TreeSet: alphabetical/ascending order
		//  linkedHashset: insertion order
		// hashset: unpredictable order 
		//
	TreeSet<Integer>t=new TreeSet<>();
	t.add(10);
	t.add(5);
	t.add(11);
	t.add(11);
	System.out.println(t);
	
	LinkedHashSet<Integer>t1=new LinkedHashSet<>();
	t1.add(10);
	t1.add(5);
	t1.add(6);
	System.out.println(t1);
	
	HashSet<Integer>t11=new HashSet<>();
	t11.add(10);
	t11.add(5);
	t11.add(4);
	System.out.println(t11);
	
		
	}

}
