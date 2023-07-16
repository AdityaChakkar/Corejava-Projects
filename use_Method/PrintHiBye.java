package use_Method;
import java.util.Scanner;
class PrintHiBye 
{
	public static void toPrint(int num){
		for (int i =0;i<=num ;i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("HiiBye");
			}
			else if (i % 3 == 0)
			{
				System.out.println("Hi");
			}
			else if(i % 5 == 0){
			    System.out.println("Bye");
			}
			else{
                System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice :");
		int num = sc.nextInt();
		toPrint(num);

	}
}
