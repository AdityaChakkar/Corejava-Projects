package use_Method;
import java.util.Scanner;
class FactUsingRecursion 
{
	static int resultFact(int n){
		if (n >=1)
		{
		 return n*resultFact(n-1);	
		}
		else{
			return 1;
		}

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice number :");
		int n = sc.nextInt();
		int result =resultFact(n);
		System.out.println("The Factorial of "+n+" is "+result);
	}
}
