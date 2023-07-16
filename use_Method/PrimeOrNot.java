package use_Method;
import java.util.Scanner;
class PrimeOrNot 
{
	static void checkPrime(int num){
	int count = 0;
	for (int i = 1;i<=num ;i++ )
	{
		if (num%i==0)
		{
			count++;
		}
	}
	if (count == 2)
	{
		System.out.println("Number is Prime");
	}
	else{
		System.out.println("Number is not Prime");
	}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice number :");
		int num = sc.nextInt();
		checkPrime(num);
	}
}
