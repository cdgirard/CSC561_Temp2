import java.util.Iterator;

/**
 * This should be some data structure: an array, list, tree, etc...
 * @author cdgira
 *
 */
public class ConcreteAggregate implements Iterable<Integer>
{
    int values[] = new int[10];
    
	@Override
	public Iterator<Integer> iterator() 
	{
		return new ConcreteIterator(values);
		// or if there are a lot of functions in my
		//    class for working with the data structure, just pass
		//    the instance of the class.
		// return new ConcreteIterator(this);
	}

}
