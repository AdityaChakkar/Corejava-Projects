package use_Method;
import java.util.Scanner;
class PalindromeNumber 
{
	static void isPalindrome(int num){
		int rev = 0;
		int num2 = num;
		while (num > 0)
		{
			int last = num % 10;
			rev = rev *10 + last;
			num = num /10;
		}
		System.out.println(rev);
		if (rev == num2)
		{
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not a Palindrome");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter more than 1 digit number : ");
		int num = sc.nextInt();
		isPalindrome(num);
	}
}
