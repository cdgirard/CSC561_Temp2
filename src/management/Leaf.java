package management;

import duck.Duck;

public class Leaf extends HuntingComponent
{
	Duck myDuck = null;
	
	@Override
	public void setDuck(Duck d)
	{
		myDuck = d;
	}
	
	@Override
	public Duck getDuck()
	{
		return myDuck;
	}

}
