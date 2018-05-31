package management;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.Duck;
import duck.MallardDuck;

public class TestLeaf 
{

	@Test
	public void testInitialize() 
	{
		Leaf f = new Leaf();
		assertTrue(f instanceof HuntingComponent);
	}
	
	@Test
	public void testGetDuck()
	{
		Leaf f = new Leaf();
		MallardDuck d = new MallardDuck();
		f.setDuck(d);
		Duck tmp = f.getDuck();
		assertEquals(d,tmp);
	}

}
