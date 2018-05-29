import java.util.Iterator;

/**
 * This is pretty much the Client class from the UML on page 337 in the book.
 * Is working both with the aggregate class and the iterator class.
 * @author cdgira
 *
 */
public class Runner 
{
	public static void main(String[] args)
	{
		ConcreteAggregate c = new ConcreteAggregate();
	
		// The default forEach method in Iterable looks something like this:
		Iterator<Integer> i = c.iterator();
		while (i.hasNext())
		{
			int value = i.next();
			System.out.println(value);
		}
		
		// or we use a for each loop that makes use of the default forEach
		//    method included with Iterable.
		for (int value: c)
		{
			System.out.println(value);
		}
	}

}
