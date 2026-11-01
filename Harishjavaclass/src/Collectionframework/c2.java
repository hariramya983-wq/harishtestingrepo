package Collectionframework;

import java.util.ArrayList;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> n = new ArrayList<>();
		n.add("apple");
		n.add("mango");
		n.add("Berry");
		n.add("Lice");

		System.out.println(n);

		//remove
		n.remove(2);
		System.out.println(n);

		//reterive
		System.out.println(n.get(1));

		//iteration
		//for each /enhanced for loop
		//for (datatype tempvariable:nameofthecollection)

		for ( String n1 : n)
		{
			System.out.println(n1);
		}
			}

		}


