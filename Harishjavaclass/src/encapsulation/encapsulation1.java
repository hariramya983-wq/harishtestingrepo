package encapsulation;

public class encapsulation1 {

			/*declare variable as Private
		 * must not assign value straightly to the variable
		 * access the variable trough setter and getter
		 * Setter : assign value to variable
		 * getter : view the value stored in the variable
		 * setter,getter ->public ,non static 
		 */
		private String password;
		
		public void set(String p)
		{
			password=p;
		}

		public void get()
		{
			System.out.println(password);
		}
	}


