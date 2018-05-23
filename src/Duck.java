
public class Duck 
{
    protected FlyBehavior flyBehavior = new Fly();
    
	public String fly() 
	{
		return flyBehavior.fly();
	}

}
