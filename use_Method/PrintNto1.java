package use_Method;
import java.util.Scanner;
class PrintNto1
{
	public static void usingfor(int num){
		System.out.println("***************************");
		System.out.println("Using For Loop");
		for (int i= num;i>=1 ;i-- )
		{
			System.out.println(i);
		}
		System.out.println("***************************");
	}
 	public static void usingWhile(int num){
		System.out.println("Using While Loop");
		int i =num;
		while (i>=1)
		{
			System.out.println(i);
			i--;
		}
		System.out.println("***************************");
	}
	public static void usingDoWhile(int num){
		System.out.println("Using Do-While Loop");
		int i =num;
		do
		{
			System.out.println(i);
			i--;
		}
		while (i>=1);
	} 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		usingfor(num);
		usingWhile(num);
		usingDoWhile(num);
	}
}
