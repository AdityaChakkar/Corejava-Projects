//93.Swap two String without using third String.

package string;
import java.util.Scanner;
class SwapTwoStringWithoutUsingThird 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1 = sc.next();
		System.out.println("Enter Second String : ");
		String str2 = sc.next();

		str1= str1+str2;

		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("After Swapping the Strings ");
		System.out.println("The first String is : "+str1);
		System.out.println("The second String is : "+str2);
	}
}
