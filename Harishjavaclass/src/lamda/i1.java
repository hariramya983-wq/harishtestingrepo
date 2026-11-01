package lamda;

public class i1 {

	public static void main(String[] args) {
		String n ="dhiviya";
		//with lambda // no parameter
		
		D1 d2=()->{
			System.out.println("Hello " + n);
	
		};
		
		//calling method of interface D1 using its interface instance
		d2.pt();

	}

}
