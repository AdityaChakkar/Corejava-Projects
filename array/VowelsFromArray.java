//63.Vowels from an array
package array;
class VowelsFromArray 
{
	public static void main(String[] args) 
	{
		char[] arr={'e','p','i','a','d'};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') 
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

