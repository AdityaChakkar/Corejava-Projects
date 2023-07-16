package use_Method;
import java.util.Scanner;
class DigitalSumOfEven
{
	static void sumOFNum(long num){
	long sum = 0;
	while(num > 1)
	{
			long a =num % 10;
			if (a % 2==0)
			{
			  sum +=a ;
			}
			num=num /10 ;
	}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 1 digit number :");
		long num = sc.nextLong();
		sumOFNum(num);
	}
}
