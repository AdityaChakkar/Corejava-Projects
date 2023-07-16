//94.Replace a particular character in a String
package string;
import java.util.Scanner;
class CharacterReplaceOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		System.out.println("Choose the character that you want to replace from the given String :");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the character that you want to replace  :");
		char ch2 = sc.next().charAt(0);

		System.out.println(str.replace(ch,ch2));
	}
}
