package Buildinclasses;

public class stringcla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Welcome to Home";
		// W e l c o m e t o H o m e
		// 0 1 2 3 4 5 6 7 8 9 10 11 12
		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('c'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s +"Hai");
		System.out.println(s.concat("Hai"));
		System.out.println(s.replace('W', 'D'));
		System.out.println(s.replace("Welcome", "Dell"));
		System.out.println(s.substring(0,4));//Last value ignore till 0 ,1,2,3
		System.out.println(s.contains("come"));
	}

	}
