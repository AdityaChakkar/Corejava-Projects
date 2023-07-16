package use_Method;
import java.util.Scanner;
class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 digit Number");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		while(temp>0)
		{
		rem=temp%10;

		sum=sum+(rem*rem*rem);
		temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}
