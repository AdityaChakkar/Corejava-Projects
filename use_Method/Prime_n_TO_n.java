package use_Method;
import java.util.Scanner;
class Prime_n_TO_n
{
	static void checkPrime(int start,int end){
		for (int i = start; i<=end ;i++ )
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
		System.out.println("Enter your starting number :");
		int start = sc.nextInt();
		System.out.println("Enter your ending number :");
		int end = sc.nextInt();

		checkPrime(start,end);
	}
}
