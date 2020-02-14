package javaCourse2020;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare ArrayList
		
    ArrayList arr=new ArrayList(10);
    System.out.println(arr.size());
    arr.add(5);
    arr.add(new String("Nadeen"));
    System.out.println(arr.size());
		
    
    ArrayList<Double>arr2=new ArrayList<Double>(5);
    arr2.add(51.2);
    arr2.add(new Double(15.2));
    //arr2.add(new String("Dames"));
		//Methods Of arrayList
		
		System.out.println(arr.get(0));
		arr.remove(1);
		System.out.println(arr);
		arr.set(0, 10);
		System.out.println(arr);
		arr.add(1,20);
		arr.set(1, 'c');
		System.out.println(arr);
       
       arr.clear();
       System.out.println(arr);
		Collections.sort(arr2);
		System.out.println(arr2);
		//Use ArrayList in Loops
	for (int i = 0; i < 10; i++) {
		arr.add(i);
		System.out.println(arr);
	}
		
		
		//use ArrayList in For each
		
		   for(	double 	 x : arr2) {
			   System.out.println(x);
		   }

	}

}
