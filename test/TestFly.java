import static org.junit.Assert.*;

import org.junit.Test;

public class TestFly 
{

	@Test
	public void testFly() 
	{
		FlyBehavior fly = new Fly();
		assertEquals("Can Fly",fly.fly());
	}

}
