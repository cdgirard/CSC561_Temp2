package management;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Keeping things insanely simple:
 * Leaf: Returns a Duck
 * HuntingArea: Keeps track of other HuntingComponents
 * 
 * HuntingComponent
 *    -add -> throw not implemented exception
 *    -remove -> throw not implemented exception
 *    - getChild() -> throw not implemented exception
 *    - getDuck() -> throw not implemented exception
 * @author cdgira
 *
 */
public class TestHuntingComponent 
{

	@Test (expected = NotImplementedException.class)
	public void testAdd() 
	{
		HuntingComponent h = new MockHuntingComponent();
		h.add(null);
	}
	
	@Test (expected = NotImplementedException.class)
	public void testRemove() 
	{
		HuntingComponent h = new MockHuntingComponent();
		h.remove(null);
	}
	
	@Test (expected = NotImplementedException.class)
	public void testGetChild() 
	{
		HuntingComponent h = new MockHuntingComponent();
		h.getChild(0);
	}
	
	@Test (expected = NotImplementedException.class)
	public void testGetDuck() 
	{
		HuntingComponent h = new MockHuntingComponent();
		h.getDuck();
	}
	
	@Test (expected = NotImplementedException.class)
	public void testSetDuck() 
	{
		HuntingComponent h = new MockHuntingComponent();
		h.setDuck(null);
	}

}

class MockHuntingComponent extends HuntingComponent
{
	
}
