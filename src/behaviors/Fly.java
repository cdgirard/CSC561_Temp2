package behaviors;
// Single Line Comment -- Comments left for the programmer.
/*
 * Standard Multi-Line Comment
 */

// TODO: Something that I need to come back to.

/**
 * Javadoc Multi-Line Comment
 * This is the comment style you should use most of the time.
 */
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
		return "Can Fly";
	}

}
