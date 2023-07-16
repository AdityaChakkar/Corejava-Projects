package use_Method;
import java.util.Scanner;
class SumOFNaturalNum 
{
	static void sumOf(int n){
		int sum = 0;
		for (int i = 1;i<=n ; i++)
		{
			 sum = sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice number :");
		int n = sc.nextInt();
		sumOf(n);
	}
}
