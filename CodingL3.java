package javaCourse2020;

import java.util.Scanner;

public class CodingL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name=in.nextLine();
		System.out.println("Enter Student Mark(mid and final) :");
		double mid_mark=in.nextDouble();
		double final_mark=in.nextDouble();
		System.out.println("Round Mark And Print  Intger type");
		System.out.println("Mid Mark After Rounded :"+Math.round(mid_mark));
		System.out.println("Final Mark After Rounded :"+Math.round(final_mark));
		
	}

}
