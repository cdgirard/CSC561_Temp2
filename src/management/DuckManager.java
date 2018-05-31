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
	
	public DuckManager()
	{
		HuntingComponent root = new HuntingArea();
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

}
