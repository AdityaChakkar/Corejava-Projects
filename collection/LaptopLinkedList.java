// 106.Create a collection of laptop objects and print details
// a.Using for loop
// b.Using for each loop
// c.Using iterator()

package collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Comparator;

class Laptop
{
	String brand;
	int price;
	int ram;
	int ssd;
	
	Laptop(String brand,int price,int ram,int ssd){
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.ssd = ssd;
	}
	@Override
		public String toString(){
			return "Brand : "+brand+ ", Price : "+price+ ", Ram : "+ram+ ", SSD : "+ssd;
		}
}
class LaptopLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add(new Laptop("Asus",40000,4,512));
		l1.add(new Laptop("Lenovo",50000,8,1024));
		l1.add(new Laptop("Dell",65000,32,256));
		l1.add(new Laptop("Samsung",46000,8,512));
		l1.add(new Laptop("Hp",50000,16,1024));
		
		System.out.println("============= Using for each loop ====================");
		//Using ForEach Loop
		for (Object o : l1 )
		{
			System.out.println(o);
		}
		System.out.println("\n============= Using for loop ====================");

		//Using For Loop
		for (int i = 0 ; i< l1.size() ; i++ )
		{
			System.out.println(l1.get(i));
		}

		System.out.println("\n============= Using iterator() ====================");

		//Using Iterator 
		Iterator i1 = l1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
