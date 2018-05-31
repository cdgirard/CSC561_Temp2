package management;

/**
 * Two main types of exceptions in Java:
 * 1. The ones that I have to put in code to handle (e.g. SQLException)
 * 2. Ones that I don't have to put in code to handle, but could (e.g. NullPointerException)
 * 
 * When I want my exception to be like #1 I extend off of Exception
 * When I wnat my exception to be like #2 I extend off of RuntimeException
 * 
 * @author cdgira
 *
 */
public class NotImplementedException extends RuntimeException
{

}
