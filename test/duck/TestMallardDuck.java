package duck;
import static org.junit.Assert.*;

import org.junit.Test;

import behaviors.Fly;
import duck.Duck;
import duck.MallardDuck;

public class TestMallardDuck {

	@Test
	public void testInitialize() 
	{
		Duck d = new MallardDuck();
		assertTrue(d.flyBehavior instanceof Fly);
	}

}
