//Check the number is Strong number (145 = 1!+4!+5!=145) 145==145
package use_Method;
import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than one digit number :");
		int num = sc.nextInt();
		int temp =num;
		int sum = 0;
		while (temp > 0)
		{
			int last = temp %10;
			int fact = 1;
			for (int i =1 ;i<=last ;i++ )
			{
				fact *=i;
			}
			sum+=fact;
			temp/=10;
			System.out.println(sum);
		}
		if (sum == num)
		{
			System.out.println(num +" is Strong number");
		}
		else{
			System.out.println(num+" is Not a Strong number");
		}
	}
}
