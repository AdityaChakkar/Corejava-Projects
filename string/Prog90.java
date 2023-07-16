//90.Print each word n a String in the given format 
// format : hELLO
class Prog90 
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
	  str2+=s1.toLowerCase();
   } 
	else
	{
	  String s2="";
	  s2=s2+e.charAt(i);
	  str2+=s2.toUpperCase();
	}	
  }
	str2+=" ";	
}
	System.out.print(str2);
  }
}

/*{
	Second option------------>

	sout((str.charAt(0) + "").toLowerCase());
	for (int i = 1; i<str.length() ;i++ )
	{
		if (str.charAt(i-1) == ' ')
	{
		System.out.print((str.charAt(i) + "").toLowerCase());
	}
	else{
		System.out.print((str.charAt(i) + "").toUpperCase());
	}
	}
}
*/

