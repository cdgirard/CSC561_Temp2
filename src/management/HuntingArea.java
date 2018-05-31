package management;

import java.util.ArrayList;

public class HuntingArea extends HuntingComponent
{
	ArrayList<HuntingComponent> components = new ArrayList<HuntingComponent>();
	
	@Override
	public void add(HuntingComponent c)
	{
		components.add(c);
	}
	
	@Override
	public HuntingComponent getChild(int i)
	{
		return components.get(i);
	}
	
	@Override
	public void remove(HuntingComponent c)
	{
		// It will find the first object that has that same address
		// and remove them.  Not sure if it uses .equals or == for
		// the comparison.  For our stuff should not matter, but
		// could in a project for you in the future.
		components.remove(c);
	}

}
