package use_Method;
import java.util.Scanner;
class Factorial 
{
	static void fact(int n){
		int fact = 1;
		for (int i = n;i>=1  ; i--)
		{
			fact *= i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice number :");
		int n = sc.nextInt();
		fact(n);
	}
}
