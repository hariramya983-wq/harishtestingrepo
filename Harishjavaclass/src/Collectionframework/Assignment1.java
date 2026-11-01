package Collectionframework;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*set
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
		*/
		
		TreeSet<Double>t=new TreeSet<>();
		t.add(1.2);
		t.add(2.3);
		t.add(3.4);
		t.add(0.5);
		System.out.println(t);
		
		//remove
		
		t.remove(2.3);
		System.out.println(t);
		
		//reterive first and last 
		System.out.println(t.first());
		System.out.println(t.last());
		
		//iteration
		
		for ( double t2 : t)
		{
			System.out.println(t2);
		}
		
		LinkedHashSet<Character>t1=new LinkedHashSet<>();
		t1.add('a');
		t1.add('c');
		t1.add('b');
		System.out.println(t1);
		
		//remove
		t1.remove('c');
		System.out.println(t1);
		
		
		//reterive
		System.out.println(t1.getFirst());
		System.out.println(t1.getLast());
		
		//iteration
		
		for (char t3 : t1) 
		{
			System.out.println(t3);
		}
	}

}
