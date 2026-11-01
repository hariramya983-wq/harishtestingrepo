package encapsulation;

public class e1 {

	/*declare variable as Private
	 * must not assign value straightly to the variable
	 * access the variable trough setter and getter
	 * Setter : assign value to variable
	 * getter : view the value stored in the variable
	 * setter,getter ->public ,non static 
	 */
	
	private int rollno;
	public void set(int r)
	{
		rollno =r;
	}
	public void get()
	{
		System.out.println(rollno);
	}
	}

