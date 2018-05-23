package duck;

import behaviors.Fly;

public class MallardDuck extends Duck 
{
	
	public MallardDuck()
	{
		flyBehavior = new Fly();
	}

}
