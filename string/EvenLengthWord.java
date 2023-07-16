//85.find even length word in a sentence
package string;
class EvenLengthWord
{
	public static void main(String[] args) 
	{
		String str = "java is a programming language";
		String[] arr=str.split(" ");
		for (String el : arr )
		{
			if (el.length() % 2 == 0)
			{
				System.out.println("Even Length word is : " +el);
			}
		}
	}
}
