package management;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDuckManager {

	@Test
	public void testInitialize() 
	{
		DuckManager m = new DuckManager();
		// Would be a set of tests to see if the tree
		// was setup the way I wanted.
		assertTrue(m.getRoot() instanceof HuntingArea);
	}

}
