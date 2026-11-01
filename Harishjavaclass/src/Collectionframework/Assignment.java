package Collectionframework;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*assignment on 4/9/26
		 * 
		 * 1. create a float list, add element, remove elements, iterate over it
		 * 2. create a integer queue, add elements, remove elements, retrive first element, iterate over it
		 * 3. create a double tree set , add elements, remove elements, iterate over it
		 * 4. create a character hash set, add elements, remove elements, iterate over it
		 * 5. create a tree map(key: double, element: string), add elements, remove elements, display key alone
		 * 6. create a hash table (key: float, element: character), add elements, remove elements, display value alone
		 * 
		  * */
		
		ArrayList<Float> n = new ArrayList<>();
		n.add(30.3f);
		n.add(20.2f);
		n.add(10.4f);
		n.add(0.6f);

		System.out.println(n);

		//remove
		n.remove(2);
		System.out.println(n);

		//reterive
		System.out.println(n.get(1));

		//iteration
		//for each /enhanced for loop
		//for (datatype tempvariable:nameofthecollection)

		for ( float n1 : n)
		{
			System.out.println(n1);
		}
			
	ArrayBlockingQueue<Integer> n1 =new ArrayBlockingQueue<>(4);
	n1.add(30);
	n1.add(20);
	n1.add(10);
	n1.add(6);

	System.out.println(n1);

	//remove
	n1.remove(2);
	System.out.println(n1);

	//reterive
	System.out.println(n1.peek());

	//iteration
	//for each /enhanced for loop
	//for (datatype tempvariable:nameofthecollection)

	for ( int n2 : n1)
	{
		System.out.println(n2);
	}
	
		}

		
	}

