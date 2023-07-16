//handle StringIndexOutOfBoundsException.
package exceptions;
class StringIndexOutOfBoundsExceptions 
{
	public static void main(String[] args) 
	{
		String str = "Hello World";
		try
		{
			for (int i = 0 ; i<=str.length() ; i++ )
		{
			System.out.print(str.charAt(i));
		}
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("\nException Handled");
		}
	}
}
