package Collectionframework;

import java.util.ArrayList;

public class cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> n = new ArrayList<>();
n.add(30);
n.add(20);
n.add(10);
n.add(0);

System.out.println(n);

//remove
n.remove(2);
System.out.println(n);

//reterive
System.out.println(n.get(1));

//iteration
//for each /enhanced for loop
//for (datatype tempvariable:nameofthecollection)

for ( int n1 : n)
{
	System.out.println(n1);
}
	}

}
