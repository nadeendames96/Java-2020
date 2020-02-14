package javabasics;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println("Welcome");
		    Scanner in=new Scanner(System.in);
		    System.out.println("Please Enter Student Name:");
		    String stu_fullname=in.nextLine();
		    System.out.println("Please Enter Id of Student:");
		    long id=in.nextLong();
		    
		  
		    double mid_mark=in.nextDouble();
		    double final_mark=in.nextDouble();
		    
		    double sum=mid_mark+final_mark;
		    double final_sum=sum+10;
		    
		    if(final_sum>=50) {
		    	System.out.println("Pass "+final_sum);
		    }
		    else {
		    	System.out.println("Fail "+final_sum);
		
	}

}
}
