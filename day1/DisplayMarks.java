package day1;
import java.util.Scanner;
class DisplayMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of English :");
		double eng = sc.nextInt();
		System.out.println("Enter the Marks of Marathi :");
		double mar = sc.nextInt();
		System.out.println("Enter the Marks of Hindi :");
		double hin = sc.nextInt();
		System.out.println("Enter the Marks of Maths :");
		double math = sc.nextInt();
		double result = (eng + mar + hin + math)/4;
		System.out.println("The result is : "+ result);
		if (result >35)
		{
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}
