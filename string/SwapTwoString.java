//92.Swap two String using third String
package string;
import java.util.Scanner;
class SwapTwoString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String str1 = sc.next();
		System.out.println("Enter second String : ");
		String str2 = sc.next();
		String str3 = "";

		str3 = str1;
		str1 = str2;
		str2 = str3;
		System.out.println("After Swapping the element =");
		System.out.println("The First String is "+str1);
		System.out.println("The Second String is "+str2);
	}
}
