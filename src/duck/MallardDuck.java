package duck;

import behaviors.Fly;

public class MallardDuck extends Duck 
{
	
	public MallardDuck()
	{
		flyBehavior = new Fly();
		if (flyBehavior == null)
		{
			// Stops it from making an instance of the class
			//throw new FailedToGetBehaviorException();
		}
	}

}
