//69.find the frequency of the given array. 
package array;
import java.util.HashSet;
class FindFrequency 
{
	public static void main(String[] args) 
	{
		int [] arr = {0,0,8,56,3,6,3,5,3,2,2,3,3,5,1,1,1};
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int ele : arr )
		{
			System.out.print(ele+" ");
		}
		for (int i = 0 ; i <arr.length ; i++ )
		{
			hs.add(arr[i]);
		}
		System.out.println("\n"+hs+"\n");
		for (int el : hs )
		{
			int count = 0;
			for (int i = 0; i <arr.length ; i++ )
			{
				if (el == arr[i])
				{
					count++;
				}
			}
			System.out.println(el+" : "+count);
		}
	}
}
