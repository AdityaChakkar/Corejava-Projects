//76&77.Program to find intersetion and union of 2 array
package array;
import java.util.HashSet;
class IntersectionUnion 
{
	public static void main(String[] args) 
	{
		int[] arr1={1,2,3,4};
		int[] arr2={1,2,5,6};
        HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			hs.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++)
		{
			hs.add(arr2[j]);
		}
		System.out.print("Union of both array is "+hs);
		System.out.print("\nIntersection of both array is : ");
		//Intersection of an array
		for(int el:arr1)
		{
			for(int el2:arr2)
			{
				if(el==el2)
				{
					System.out.print(el+" ");
				}
			}
		}
	}
}
