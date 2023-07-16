//82.Reverse a String and Print.
package string;
class ReverseString 
{
	public static void main(String[] args) 
	{
		String s = "Aditya";
		String ns="";
		char ch;
		for (int i = 0;i<s.length() ; i++ )
		{
			ch = s.charAt(i);
			ns = ch +ns;
		}
		System.out.println(ns);
	}
}
