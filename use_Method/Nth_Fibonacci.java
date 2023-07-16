package use_Method;
import java.util.Scanner;
class Nth_Fibonacci 
{
	static void nthFibonacci(int limit){
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for (int i = 1;i<=limit;i++ )
		{
		    sum = num1+num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
		}
		
		System.out.println("\n The "+limit+"th number is :"+sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit number : ");
		int limit = sc.nextInt();
		nthFibonacci(limit);
	}
}
