package string;
class StringReverse 
{
	public static void main(String[] args) 
	{
		String s = "Java is a Programming language which allow programmer to create secured application";
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
