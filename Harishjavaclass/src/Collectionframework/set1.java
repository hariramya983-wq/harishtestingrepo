package Collectionframework;

import java.util.TreeSet;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>t=new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(11);
		t.add(14);
		System.out.println(t);
		t.remove(5);
		System.out.println(t);
		for (int x : t)
		{
			System.out.println(x);
		}
	}

}
