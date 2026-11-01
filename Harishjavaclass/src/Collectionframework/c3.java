package Collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayBlockingQueue
		//queue : not indexed
		//add
		//reterive
		//remove
		//size limitation
		//ArrayBlockingQueue<Datatype> name=new ArrayBlockingQueue<>(Size);
		
		ArrayBlockingQueue<Double> n =new ArrayBlockingQueue<>(4);
		n.add(2.3);
		n.add(1.3);
		n.add(0.3);
		n.add(0.6);
		
		System.out.println(n);
		
		//remove
		n.remove(0.3);
		System.out.println(n);
		
		//reterive
		
		System.out.println(n.peek());
		
		for(double x :n)
		{
			System.out.println(x);
		}
		
	}

}
