import java.util.ArrayList;

public class WeatherStation 
{
	ArrayList<ObserverInterface> observers = new ArrayList<ObserverInterface>();
    int temp;
	public void setTemp(int t) 
	{
		temp = t;
	}

	public int getTemp() 
	{
		return temp;
	}

	public void addObserver(ObserverInterface mo) 
	{
		observers.add(mo); // Adds it to my ArrayList of observers.
	}

	public void notifyObservers() 
	{
		// Same loop as
		// for (int x=0;x<observers.size();x++)
		// { 
		//     ObserverInterface obv = observers.get(x);
		// rest is the same.
		for (ObserverInterface obv : observers)  // for each loop
		{
			obv.update(temp);
		}
	}

}
