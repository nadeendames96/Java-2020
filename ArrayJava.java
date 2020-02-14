package javaCourse2020;

import java.util.Scanner;

public class ArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Primitive Datatype(int,double,char,etc...)
		 * Not Primitive Datatype(String,Double,Integer,etc....)
		 * 
		 */
		System.out.println("Welcome");
		
		Scanner in=new Scanner(System.in);
		//Declare Array
		
		int[]arr=new int[10];
		int arr2[];
		int []arr3= {1,2,3,4,5,6};
		arr[0]=1;
		arr[1]=10;
		
	
		//Use Array in Loops
		
	   for (int i = 0; i <arr.length; i++) {
		arr[i]=i;
	}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		//For Each Loop
		for(int x : arr) {
			System.out.println(x);
		}
		
		
		//Dimintional Array
		double[][] arr4=new double[2][2];
		arr4[0][0]=10;
		arr4[0][1]=20;
		//

	}

}
