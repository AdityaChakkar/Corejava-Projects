//97.98. handle ClassCastException

package exceptions;
class A
{
	int a = 10;
}
class B extends A
{
	int b = 20;
	int c = a+b;
}

class ClassCastExceptions
{
	public static void main(String[] args) 
	{
		A a = new A();
		try
		{
				B b = (B) a;
				System.out.println(b);
		}
		catch (ClassCastException e)
		{
			System.out.println("ClassCastExceptions handled");
			e.printStackTrace();
			System.out.println("ClassCastExceptions handled");
		}
	}
}
