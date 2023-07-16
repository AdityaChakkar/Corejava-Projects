package use_Method;
import java.util.Scanner;
class ReverseAndStore 
{
	static void toStore(int num){
		int rev = 0;
		while (num > 0)
		{
			int last = num % 10;
			rev = rev *10 +last;
			num = num /10;
		}
		System.out.println("Reverse number is :"+rev);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 1 digit number :");
		int num =sc.nextInt();
		toStore(num);
	}
}
