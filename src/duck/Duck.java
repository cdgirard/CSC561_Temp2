package duck;

import behaviors.FlyBehavior;

public class Duck 
{
	private static int nextID = 0;
	// final means it can only be set once.
	protected final int myID;
	/**
	 * If Fly is the default behavior for a Duck then
	 * my tests and how I have this is great.
	 * 
	 * However, if the default behavior for a Duck
	 * should be null, then I have some serious issues.
	 */
    protected FlyBehavior flyBehavior = null;
    
    public Duck()
    {
    	myID = nextID;
    	nextID++;
    }
    
	public String fly() 
	{
		return flyBehavior.fly();
	}

}
