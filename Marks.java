package javabasics;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Enter Student NAme:
		 * *----
		 * Enter Student Mark(Mid & Final)
		 * *----
		 * *----
		 * Mid Mark After Rounded:
		 * Final Mark After Rounded:
		 * 
		 */
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String stu_name=in.nextLine();
        System.out.println("Enter Student Marks(Mid And Final :)");
        double mid_mark=in.nextDouble();
        double final_mark=in.nextDouble();
        System.out.println("Mid Mark After Rounded: "+Math.round(mid_mark));
        System.out.println("Final Mark After Rounded: "+Math.round(final_mark));
      
	}

}
