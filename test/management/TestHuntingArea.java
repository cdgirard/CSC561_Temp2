package management;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHuntingArea 
{

	@Test
	public void testAdd() 
	{
		HuntingArea h = new HuntingArea();
		HuntingArea b = new HuntingArea();
		h.add(b);
		assertEquals(b,h.getChild(0));
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemove()
	{
		HuntingArea h = new HuntingArea();
		HuntingArea b = new HuntingArea();
		h.add(b);
		h.remove(b);
		// Another way to handle this is check how many components
		// HuntingArea is keeping track of.
		assertEquals(b,h.getChild(0));
	}

}
