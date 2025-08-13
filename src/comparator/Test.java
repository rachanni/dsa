package comparator;

import java.util.Comparator;
import java.util.TreeSet;

//write a program to insert Integer object into the TreeSet where sorting order is 
//descending order.
//default natural sorting order -> ascending order
//so we have to inplement comparator
public class Test {

	public static void main(String[] args) {
		
//		PASSING OUR CUSTOM COMPARATOR 
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		t.add("A");
		System.out.println(t);
	}
}

 class MyComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Integer i1= (Integer)o1;
		Integer i2= (Integer)o2;
		
		if(i1 < i2) {
			return +1;
		}else if(i1>i2) {
			return -1;
		}else {
			return 0;
		}
	}
}
