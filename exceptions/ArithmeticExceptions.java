//97.Handle the following exceptions
package exceptions;
class ArithmeticExceptions 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 5;
		try
		{
			int c = b/a;
			System.out.println(c);	
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception handled Successfully");
		}
		finally{
			System.out.println("We can not devide any number by zero");
		}
	}
}
