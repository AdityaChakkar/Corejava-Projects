//87.Count how many words Start with Vowels.

package string;
class CountWordsStartWithVowels
{
	public static void main(String[] args) 
	{
		String str = "Java is a Programming Language";
		String[] arr = str.split(" ");
		int count = 0;
		for (String el : arr )
		{
			char ch = el.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		  }
		System.out.println(count);
	} 
}
