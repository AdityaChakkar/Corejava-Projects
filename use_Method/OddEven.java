package use_Method;
import java.util.Scanner;
class OddEven 
{
	public static void checkNumber(int num){
		if (num % 2 == 0)
		{
			System.out.println("The number is Even");
		}
		else{
		     System.out.println("The number is Odd");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice number :");
		int num = sc.nextInt();
		checkNumber(num);
	}
}
