//102.Create a homogeneous collection of Mobile Objects and print the details 
// a.using for loop
// b.using for each loop
// c.using iterator()

package collection;
import java.util.*;

class Mobile implements Comparable
{
	String brand;
	int price;

	Mobile(String brand,int price){
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString(){
		return " Brand : " +brand+ ", Price : " +price;
	}

	@Override
	public boolean equals(Object o){
		Mobile temp = (Mobile) o;
		if (this.brand == temp.brand && this.price == temp.price)
		{
			return true;
		}
		return false;
	}

	@Override
	public int hashCode(){
		return brand.hashCode() + ((Integer)price).hashCode();
	}

	@Override
	public int compareTo(Object o){
		Mobile temp = (Mobile) o;
		if (this.price > temp.price)
		{
			return 1;
		}
		if (this.price < temp.price)
		{
			return -1;
		}
		return 0;
	}
}

class Comparable1
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(new Mobile("Samsung s23",100000));
		a1.add(new Mobile("Apple iphone 15",200000));
		a1.add(new Mobile("Lava" ,20000));

		System.out.println("\n============= Using for each loop ====================");
		//Using ForEach Loop
		for (Object o : a1 )
		{
			System.out.println(o);
		}

		System.out.println("\n============= Using for loop ====================");

		//Using For Loop
		for (int i = 0 ; i< a1.size() ; i++ )
		{
			System.out.println(a1.get(i));
		}

		System.out.println("\n============= Using iterator() ====================");

		//Using Iterator 
		Iterator i1 = a1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}

		System.out.println("********************************************");
	}
}
