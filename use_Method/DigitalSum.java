package use_Method;
import java.util.Scanner;
class DigitalSum 
{
	static void sumOFNum(int num){
	int sum = 0;
	while(num >= 1)
	{
		int a =num % 10;
		sum +=a ;
	    num=num /10 ;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter more than 1 digit number :");
		int num = sc.nextInt();
		sumOFNum(num);
	}
}
