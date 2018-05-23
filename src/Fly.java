
public class Fly implements FlyBehavior 
{

	/**
	 * Override is where a subclass replaces the functionality
	 * of a method from the superclass or an interface.
	 */
	@Override  // The @Override is optional, but means Java will check
	           // that the method I am overriding does exist in the superclass
	           // or interface.
	public String fly() 
	{
		return "Fly";
	}

}
