//84.Count the number of Vowel,Consonant,Space and Special Character in a Sentence
package string;
class CountVowels_Consonant_SpChar_Spaces 
{
	public static void main(String[] args) 
	{
		String str = " Hello World!@&$ ";
		int vCount = 0,cCount = 0,spCount = 0,scCount = 0;
		for (int i = 0 ; i<str.length() ; i++ )
		{
			char ch = str.charAt(i);
			if (ch>= 'a' && ch<='z')
			{
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					vCount++;
				}
				else {
					cCount++;
				}
			}
			else{
				if (ch==' ')
				{
					spCount++;
				}
				else{
					scCount++;
				}
			}
		}
		System.out.println("Vowels : " +vCount);
		System.out.println("Consonant : " +cCount);
		System.out.println("Spaces : " +spCount);
		System.out.println("Special Characters : " +scCount);
	}
}
