package behaviors;
import static org.junit.Assert.*;

import org.junit.Test;

import behaviors.Fly;
import behaviors.FlyBehavior;

public class TestFly 
{

	@Test
	public void testFly() 
	{
		FlyBehavior fly = new Fly();
		assertEquals("Can Fly",fly.fly());
	}

}
