//Swap the number without using third variavble
package use_Method;
import java.util.Scanner;
class SwapNum2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int num2 = sc.nextInt();
		num1 = num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		System.out.println("The 1st number after Swapping is :" +num1);
		System.out.println("The 2nd number after Swapping is :" +num2);
	}
}
