// 106.Create a collection of laptop objects and sort them on the basis of 
// a.price
// b.ssd
// c.ram

package collection;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

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
	@Override
		public boolean equals(Object o){
			Laptop temp = (Laptop) o;
			if (this.brand == temp.brand && this.price == temp.price && this.ram == temp.ram)
			{
				return true;
			}
			return false;
		}
	@Override
		public int hashCode(){
			return brand.hashCode() + (Integer.valueOf(price)).hashCode() + (Integer.valueOf(ram)).hashCode()+(Integer.valueOf(ssd)).hashCode();
		}
}
class RamComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		Laptop temp1 = (Laptop) o1;
		Laptop temp2 = (Laptop) o2;
		if (temp1.ram > temp2.ram)
		{
			return 1;
		}
		if (temp1.ram < temp2.ram)
		{
			return -1;
		}
		return 0;
	}
}
class SSDComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		Laptop temp1 = (Laptop) o1;
		Laptop temp2 = (Laptop) o2;
		if (temp1.ssd > temp2.ssd)
		{
			return 1;
		}
		if (temp1.ssd < temp2.ssd)
		{
			return -1;
		}
		return 0;
	}
}
class PriceComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		Laptop temp1 = (Laptop) o1;
		Laptop temp2 = (Laptop) o2;
		if (temp1.price > temp2.price)
		{
			return 1;
		}
		if (temp1.price < temp2.price)
		{
			return -1;
		}
		return 0;
	}
}
class LaptopComparator
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(new Laptop("Asus",40000,4,512));
		a1.add(new Laptop("Lenovo",50000,8,1024));
		a1.add(new Laptop("Dell",65000,32,256));
		a1.add(new Laptop("Samsung",46000,8,512));
		a1.add(new Laptop("Hp",50000,16,1024));
		
		System.out.println("===========On the basis of Ram===========\n");
		Collections.sort(a1,new RamComparator());
		for (Object o: a1 )
		{
			System.out.println(o);
		}
		System.out.println("\n===========On the basis of SSD===========\n");
		Collections.sort(a1,new SSDComparator());
		for (Object o: a1 )
		{
			System.out.println(o);
		}
		System.out.println("\n===========On the basis of Price===========\n");
		Collections.sort(a1,new PriceComparator());
		for (Object o: a1 )
		{
			System.out.println(o);
		}
	}
}
