import static org.junit.Assert.*;

import org.junit.Test;

public class TestMallardDuck {

	@Test
	public void testInitialize() 
	{
		Duck d = new MallardDuck();
		assertTrue(d.flyBehavior instanceof Fly);
	}

}
