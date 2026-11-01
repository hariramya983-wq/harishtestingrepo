package abstraction;

abstract public class parent {
	/*abstraction: hiding implementation details
	 * can be achieved through abstract class and abstract method
	 * 
	 * class-> abstract class: add abstract keyword
	 * 
	 * abstract class: nrml method and abstractmethod
	 * 
	 * abstract method:  
	 *         nonstatic
	 *         abstract keyword
	 *         will be empty
	 *         contnent will be defined in child
	 *         
	 * follows inheritance 
	 * 
	 * we cannot create an object for abstract class 
	 * 
	 
	 * 
	 * */
	public void nm()
	{
		System.out.println("Normal method");
	}
	abstract public void ab();
}
