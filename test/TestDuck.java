import static org.junit.Assert.*;

import org.junit.Test;

public class TestDuck 
{
	
	@Test
	public void testInitialize()
	{
		Duck d = new Duck();
		assertNull(d.flyBehavior);
	}

	@Test
	public void testFly() 
	{
		Duck d = new Duck();
		/**
		 * Using another class that is in development to test
		 * Duck can be dangerous and lead to issues later if that
		 * class gets changed as it can cause tests in Duck to fail
		 * when there are no issues with Duck.
		 * 
		 * We want to avoid this problem whenever possible.  We 
		 * solve this issue by using Mock Classes (classes that 
		 * act like the classes we need, but are not part of the
		 * development code).  We can build the Mock Class ourself
		 * or use a framework like EasyMock
		 * 
		 * There is a catch-22 with using Mock classes.  Changes
		 * to Fly will no longer break Duck, but Duck may also become
		 * unaware of changes to Fly that it should be aware of.  Which
		 * is the best choice really only comes with experience.  Hopefully
		 * the Mock Class would malfunction due to the changes.
		 */
		d.flyBehavior = new MockFly();
		assertEquals("Fly",d.fly());
	}

}

// Usually embed the MockClass in the Test that needs it.
class MockFly implements FlyBehavior
{

	@Override
	public String fly() 
	{
		return "Fly";
	}
	
}
