package use_Method;
import java.util.Scanner;
class DigitalMultiOfEven 
{
	static void checkMultiply(int num){
		int multi = 1;
		while (num > 1)
		{
			int a = num % 10;
			if (a % 2==0)
			{
				multi *= a;
			}
			num = num /10;
		}
		System.out.println(multi);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 1 digit number");
		int num = sc.nextInt();
		checkMultiply(num);
	}
}
