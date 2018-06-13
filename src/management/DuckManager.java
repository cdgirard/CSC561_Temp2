package management;

import duck.MallardDuck;

/**
 * This guys job is to manage all the hunting areas that
 * contain Ducks.  Some hunting areas can contain smaller
 * hunting areas.
 * Client for the Composite Pattern
 * @author cdgira
 *
 */
public class DuckManager 
{
	// Private so no one can randomly set theInstance to null.
	// static so the createInstance static method can access it.
	// Testing with static class variable is a pain because they
	// don't reset between tests.  Since they keep their value
	// it can be very hard to test with them, even more so since
	// JUnit's ordering of running the tests is not something we
	// can easily control.
	// Because of this, it is usually a good idea to build in a 
	// reset method for the instance variable that has limited access.
	private static DuckManager theInstance;
	// Leaving as default so can access for tests, but 
	// don't want as protected because don't want any
	// subclasses to access it.
	HuntingComponent root;
	
	/**
	 * Mainly just for testing.  A mock class would not work unless
	 * I changed the access on the instance variable itself.
	 */
	static void resetTheInstance()
	{
		theInstance = null;
	}
	
	private DuckManager()
	{
		root = new HuntingArea();
		root.add(new HuntingArea());
		root.add(new Leaf());
		root.add(new HuntingArea());
		root.getChild(0).add(new Leaf());
		root.getChild(1).setDuck(new MallardDuck());
		root.getChild(2).add(new Leaf());
		// root.getChild(2).getChild(0).add(new HuntingArea());  // Should Fail
		if (root.getChild(2).getChild(0) instanceof Leaf)
		    root.getChild(2).getChild(0).setDuck(new MallardDuck());
		else
			root.getChild(2).getChild(0).add(new HuntingArea()); 
	}
	
	/**
	 * Is a bit like a factory method.  It just
	 * happens to always be the same instance.
	 * @return
	 */
	public static DuckManager getInstance()
	{
		if (theInstance == null)
			theInstance = new DuckManager();
		return theInstance;
	}

	public void initializeRoot() 
	{
		root = null;
	}

}




