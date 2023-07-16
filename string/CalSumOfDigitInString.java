//86.WAP to calculate the sum of digits in the String
//for eg: Fs8g6hu
//o/p : 14 (8+6)

package string;
class CalSumOfDigitInString 
{
	public static void main(String[] args) 
	{
		String str = "Fs8g6hu";
		int sum = 0;
		for (int i = 0 ; i<str.length() ; i++ )
		{
			char ch = str.charAt(i);
			if (ch>='0' && ch<='9')
			{
				sum += ch -'0';
			}
		}
		System.out.println("The String is : "+str);
		System.out.println("Sum of digit in a String is : "+sum);

		/*
		String str = "ab13cd456";
		String str1="";
	 for(int i=0;i<str.length();i++)
		{
		 char ch=str.charAt(i);
		 if(ch>='0' && ch<='9')
			{
			 str1+=str.charAt(i);
			}
		}
		int n=Integer.parseInt(str1);
		System.out.println(str1);
		System.out.println(n);
		int sum=0;
		
		while(n>0)
		{
			int last =  n%10;
			sum = sum+last;
			n=n/10;
		}
		System.out.println(sum);
		*/
	}
}
