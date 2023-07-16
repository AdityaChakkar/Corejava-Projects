package use_Method;
import java.util.Scanner;
class Print1toN
{
	public static void usingfor(int num){
		System.out.println("***************************");
		System.out.println("Using For Loop");
		for (int i= 1;i<=num ;i++ )
		{
			System.out.println(i);
		}
		System.out.println("***************************");
	}
	public static void usingWhile(int num){
		System.out.println("Using While Loop");
		int i =1;
		while (i<=num)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("***************************");
	}
	public static void usingDoWhile(int num){
		System.out.println("Using Do-While Loop");
		int i =1;
		do
		{
			System.out.println(i);
			i++;
		}
		while (i<=num);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		usingfor(num);
		usingDoWhile(num);
		usingWhile(num);
	}
}
