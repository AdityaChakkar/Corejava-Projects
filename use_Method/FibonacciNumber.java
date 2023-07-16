package use_Method;
import java.util.Scanner;
class FibonacciNumber 
{
	static void toFibonacci(int num){
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for (int i = 0;i<=num ;i++ )
		{
		sum = num1 + num2;
		System.out.print(sum+" ");
		num1 = num2;
		num2 = sum; 
		}
		System.out.println("\n"+sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st number :");
		int num = sc.nextInt();
		toFibonacci(num);
	}
}
