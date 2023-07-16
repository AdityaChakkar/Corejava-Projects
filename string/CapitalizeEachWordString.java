//89.Capitalize each character of each word in given String
package string;
class CapitalizeEachWordString 
{
	public static void main(String[] args) 
	{
		String str = "HELLO WORLD";
		String[] arr = str.split(" ");
		String str2="";
		  for(String e : arr)
			{
			  for(int i=0;i<e.length();i++)
				{
			  if(i==0)
					{
				  String s1="";
				  s1=s1+e.charAt(i);
				  str2+=s1.toUpperCase();
                     } 
					 else
					   {
						 String s2="";
						 s2=s2+e.charAt(i);
						 str2+=s2.toLowerCase();
					   }	
				}
				str2+=" ";	
			}
			System.out.print(str2);
	}
}
