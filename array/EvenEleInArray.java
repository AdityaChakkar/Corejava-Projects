//even numbers from an array
package array;
class EvenEleInArray 
{
public static void main(String[] args) 
	{
		int[] arr={1,3,2,4,5};
		System.out.print("The Even Element of an array is : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
