import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeatherStation 
{

	@Test
	public void testSetTemperature()
	{
		WeatherStation ws = new WeatherStation();
		ws.setTemp(15);
		assertEquals(15,ws.getTemp());
	}
	
	@Test
	public void testUpdateTemperature() 
	{
		MockObserver mo = new MockObserver();
		WeatherStation ws = new WeatherStation();
		ws.addObserver(mo);
		ws.setTemp(15);
		ws.notifyObservers();
		assertEquals(15,mo.temp);
	}

}

class MockObserver implements ObserverInterface
{
    int temp;
	@Override
	public void update(int t) 
	{
		temp = t;
	}
	
}