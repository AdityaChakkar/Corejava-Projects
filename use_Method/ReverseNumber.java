package use_Method;
import java.util.Scanner;
class ReverseNumber 
{
	static void toReverse(int num){
		int rev = 0;
		while (num > 0)
		{
			int last = num % 10;
			System.out.print(last);
			num = num/10;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 1 digit number :");
		int num = sc.nextInt();
		toReverse(num);
	}
}
