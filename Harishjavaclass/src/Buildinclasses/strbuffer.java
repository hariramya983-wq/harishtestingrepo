package Buildinclasses;

public class strbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer n = new StringBuffer("Welcome");
// index w e l c o m e
//       0 1 2 3 4 5 6

System.out.println(n.length());
System.out.println(n.charAt(2));
System.out.println(n.indexOf("c"));
	

	//append and insert
	
System.out.println(n.append("bye"));
System.out.println(n.insert(2,'r'));

//delete

System.out.println(n.deleteCharAt(2));
System.out.println(n.delete(0, 3));
System.out.println(n.reverse());
System.out.println(n.reverse());

//replace 

System.out.println(n.replace(0, 3, "Hai"));
System.out.println(n.substring(0, 3));

	}
}
