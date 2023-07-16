package	use_Method;
import java.util.Scanner;
class PerfectSquare2 
{
   public static void main(String[]	args) 
	{
		for(int	i=1; i<=100; i++)
			{
			 for(int j=1; j<=100; j++)
			{
			  int d=j*j;
			 if(i==d)
			{
			 System.out.println(d+"	is a perfect square");
			}
		}
	  }
	}
}