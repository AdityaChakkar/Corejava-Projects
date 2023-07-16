//98.Print Stack Trace
package exceptions;
class SalaryException extends RuntimeException
{
	@Override
		public String getMessage(){
			return "salary cannt be negative";
		}
}
class PrintStackTrace 
{
	static void m1(){
		m2();
	}
	static void m2(){
		throw new SalaryException();
	}
	public static void main(String[] args) 
	{
		System.out.println("main Starts");
		try
		{
			m1();
		}
		catch (SalaryException e)
		{
			e.printStackTrace();
			System.out.println("main Ends");
		}
	}
}
