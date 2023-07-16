//96.Check whether two string are anagram or not (two string are said to be anagram if we can form one string string by arranging the characters of another string)
//e.g. Race and Care here we can form Race by arranging the character of Care)

package string;
import java.util.Scanner;
class AnagramString
{
	public static void main(String[] args) 
	{
 
        String str1 = "Listen";
		String str2=  "Silent";
		String str3 = str1.toLowerCase();
		String str4 = str2.toLowerCase();
		int count = 0;

          for(int i=0; i<str3.length();i++){

			  for(int j=0; j<str4.length();j++){
 
                   if(str3.charAt(i)==str4.charAt(j)){

                           count++;
				   }

			  }
		  }
		   System.out.println(count);

		  if(count==str1.length()){

                   System.out.println("strings are anagram");
		  }
		  else{
                 System.out.println("strings are not anagram");
		}
	}
}
