package javaCourse2020;

import java.util.Scanner;

public class HomeworkNo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String stu_name=in.nextLine();
		System.out.println("Enter Student ID");
		long id=in.nextLong();
		    System.out.println("Enter Student Midtern");
		    double mid_mark=in.nextDouble();
		    System.out.println("Enter Final Mark Of Student");
		    double final_mark=in.nextDouble();
		    double sum=mid_mark+final_mark;
		    System.out.println("Summation Marks Of Student is"+" "+sum);
		    System.out.println("Please add 10 marks of student");
		    double final_sum=sum+10;
		    
		    //complete code....
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    if(final_sum>=95) {
		    	System.out.println("A+");
		    }
		    else if(final_sum<95 && final_sum>=90) {
		    	System.out.println("A");
		    }
		    else if(final_sum<90 && final_sum>=85) {
		    	System.out.println("B+");
		    }else if(final_sum<85 && final_sum>=80) {
		    	System.out.println("B");
		    }else if(final_sum<80 && final_sum>=75) {
		    	System.out.println("C+");
		    }else if(final_sum<75 && final_sum>=70) {
		    	System.out.println("C");
		    }else if(final_sum<70 && final_sum>=65) {
		    	System.out.println("D+");
		    }
		    else if(final_sum<65 && final_sum>=60) {
		    	System.out.println("D");
		    }
		    else {
		    	System.out.println("F");
		    }
		       

	}

}
