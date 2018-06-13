package management;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDuckManager {

	/**
	 * @Before tells JUnit to always run this code before any test is
	 * run.
	 * 
	 * There is also an @After to tell JUnit to run that code after any
	 * test is run.
	 */
	@Before
	public void before()
	{
		DuckManager.resetTheInstance();
	}
	
	@Test
	public void testInitialize() 
	{
		DuckManager m = DuckManager.getInstance();
		// Can't create a new instance because the constructor
		// is private, but I can delete access to the one
		// that is there.
        // DuckManager.theInstance = null; 
		// Would be a set of tests to see if the tree
		// was setup the way I wanted.
		assertTrue(m.root instanceof HuntingArea);
	}
	
	@Test
	public void testDuckManagerMore()
	{
		DuckManager m = DuckManager.getInstance();
		m.initializeRoot();
		assertNull(m.root);
	}
	
	@Test
	public void testDuckManagerMore2()
	{
		DuckManager m = DuckManager.getInstance();
		assertTrue(m.root.getChild(0) instanceof HuntingArea);
	}
	
	@Test
	public void testDuckManagerMore3()
	{
		DuckManager m = DuckManager.getInstance();
		m.initializeRoot();
		assertNull(m.root);
	}
	
	@Test
	public void testDuckManagerMore4()
	{
		DuckManager m = DuckManager.getInstance();
		assertTrue(m.root.getChild(0) instanceof HuntingArea);
	}

}
