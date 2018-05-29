import java.util.ArrayList;
import java.util.Vector;

// gggg
public class Test 
{
    int value;
    
    public static void main(String[] args)
    {
    	int[] values = new int[10];
    	ArrayList<Integer> listOfValues = new ArrayList<Integer>();
    	Vector<Integer> vectorOfValues = new Vector<Integer>();
    	
    	/**
    	 * Where the Iterator Pattern comes in is for each data structure there
    	 * is usually a different way to iterator over all the values in that data
    	 * structure.
    	 * 
    	 * In many cases we just want to list all the values and the goal of the Iterator
    	 * Pattern is to provide a common way to do this.  That way if I change data structures
    	 * I don't have to redo all of my loops.
    	 */
    	
    	// This loop is programmed to the array implementation
    	for (int index=0;index<values.length;index++)
    	{
    		values[index] = index;
    		listOfValues.add(index);
    		vectorOfValues.add(index);
    	}
    	
    	// This loop is programmed to the ArrayList implementation.
    	for (int index=0;index<listOfValues.size();index++)
    	{
    		listOfValues.set(index, index);
    	}
    	
    	// This loop is programmed to an interface (Iterable interface in Java)
    	for (int x: values)
    	{
    		x = 4; // Does not change the value in the data structure.
    		System.out.println(x);
    	}
    	
    	// Works same for ArrayList.
    	for (int x: listOfValues)
    	{
    		System.out.println(x);
    	}
    	
    	//for (Cell c: cells)
    	//{
    		// I can change information inside the Cell c - the LifeForm it contains.
    		// But I can't changed the actual Cell at that point in the cells data structure.
    	//}
    	/**
    	 * Iterator Pattern Limits:
    	 * 1. Data structure already has to contain items.
    	 * 2. Not designed for changing values in the data structure.
    	 * 3. Not designed (usually) for removing values.
    	 * 4. Usually has no idea where that value is in the data structure.
    	 */
    	
    	
    	for (int index=0;index<vectorOfValues.size();index++)
    	{
    		vectorOfValues.set(index, index);
    	}
    	
    	for (int index=0;index<values.length;index++)
    	{
    		System.out.println(values[index]+" : "+listOfValues.get(index)+" : "+vectorOfValues.get(index));
    	}
    }
}
