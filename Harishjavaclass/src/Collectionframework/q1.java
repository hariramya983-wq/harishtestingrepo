package Collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<Integer> n =new ArrayBlockingQueue<>(4);
		n.add(2);
		n.add(1);
		n.add(3);
		n.add(3);
		
		System.out.println(n);
		
		//remove
		n.remove(1);
		System.out.println(n);
		
		//reterive
		
		System.out.println(n.peek());
		
		for(Integer x :n)
		{
			System.out.println(x);
		}
		
	}

	}


