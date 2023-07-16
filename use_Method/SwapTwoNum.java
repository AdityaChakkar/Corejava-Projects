package use_Method;
import java.util.Scanner;
class SwapTwoNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int b = sc.nextInt();
		int c =0;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping ");
		System.out.println("a(1st) num is = "+a);
		System.out.println("b(2nd) num is = "+b);
	}
}
