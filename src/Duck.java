
public class Duck 
{
	/**
	 * If Fly is the default behavior for a Duck then
	 * my tests and how I have this is great.
	 * 
	 * However, if the default behavior for a Duck
	 * should be null, then I have some serious issues.
	 */
    protected FlyBehavior flyBehavior = null;
    
	public String fly() 
	{
		return flyBehavior.fly();
	}

}
