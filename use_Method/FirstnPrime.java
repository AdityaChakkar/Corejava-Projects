package use_Method;
import java.util.Scanner;
class FirstnPrime 
{
	static void checkPrime(int num){
		for (int i = 1; i<=num ;i++ )
		{
			int count = 0;
			for (int j = 2; j< i-1 ;j++ )
			{
				if (i % j == 0)
				{
					count++;
				}
			}
			if (count == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your num number :");
		int num = sc.nextInt();

		checkPrime(num);
	}
}
