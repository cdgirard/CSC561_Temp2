import java.util.Iterator;

public class ConcreteIterator implements Iterator<Integer>
{
    int[] dataToIterateOver;
    /**
     * For whereAmI to work properly is why usually this class will
     * be tightly coupled to the concrete aggregate.
     */
    int whereAmI; 
	public ConcreteIterator(int[] values) 
	{
		dataToIterateOver = values;
		whereAmI = 0; // Place at the start point.
	}

	/**
	 * Are there any values left?
	 */
	@Override
	public boolean hasNext() 
	{
		return whereAmI < dataToIterateOver.length;
	}

	/**
	 * I need to return the present item I am located at
	 * and ALSO move to the NEXT item.
	 */
	@Override
	public Integer next() 
	{
		// Super fancy all on one line.
		return dataToIterateOver[whereAmI++];
	}

}
