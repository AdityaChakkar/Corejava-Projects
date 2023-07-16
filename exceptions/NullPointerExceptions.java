//97.Handle NullPointerException
package exceptions;
class NullPointerExceptions 
{
	public static void main(String[] args) 
	{
		int [] arr ={1,2,3,4,5};
		arr = null;
		try
		{
			for (int i = 0 ; i< arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch (NullPointerException e)
		{
			System.out.println("Exception Handled");
		}
	}
}
