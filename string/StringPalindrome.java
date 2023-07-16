//Check whether the given String is Palindrome or not
package string;
class StringPalindrome  
{
	public static void main(String[] args) 
	{
		String s = "malayalam";
		String rev = "";
		char ch ;
		for (int i = 0; i<s.length() ; i++ )
		{
			ch = s.charAt(i);
			rev = ch + rev ;
		}
		System.out.println(rev);
		if (rev.equals(s))
		{
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	}
}
