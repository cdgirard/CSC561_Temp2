import static org.junit.Assert.*;

import org.junit.Test;

public class TestDuck 
{

	@Test
	public void testFly() 
	{
		Duck d = new Duck();
		assertEquals("Fly",d.fly());
	}

}
