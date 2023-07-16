//73.Program to find possible pair of elements where the sum should be equal to given element
package array;

import java.util.Scanner;

class PairsAndSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println("Enter your choice number: ");
		int num = sc.nextInt();
		for (int i = 0 ; i<arr.length ; i++ )
		{
			for (int j = i+1; j< arr.length ; j++ )
			{
				if ((arr[i]+arr[j])==num)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+num);
					System.out.println(arr[j]+" + "+arr[i]+" = "+num);
				}
			}
		}
	}
}
