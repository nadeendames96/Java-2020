package javaCourse2020;

import java.util.Scanner;

public class IF_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome");
	     Scanner in =new Scanner(System.in);
	        System.out.println("Enter Name Of Student :");
	        String stu_fullanme=in.nextLine();
	        System.out.println("Enter Id of Student :");
	        long stu_id=in.nextLong();
	        System.out.println("Enter Midterm Mark Of Student");
           double mid=in.nextDouble();
           System.out.println("Enter Final Mark Of Student ");
           double final_mrk=in.nextDouble();
           double sum=mid+final_mrk;
           System.out.println("Add 10 marks for summation");
           double final_sum=sum+10;
           System.out.println("Summation marks of student equal "+(final_sum));
           System.out.println("Print pass if student greather than or equal 50  and less than or equal 90 and if student first letter equal' N' "
           		+ "else only print pass" 
           		+ "please add 5 marks for student if else  student less than 50 and first letter equal 'N' also add 10 marks "
           		+ "else print Fail");
           char firstLetter=stu_fullanme.charAt(0);
           if(final_sum>=50&&final_sum<=90 && firstLetter=='N' ) {
        	   final_sum+=5;
        	   System.out.println("Pass"+" "+final_sum);
           }
           else if(final_sum>=91) {
        	   System.out.println("Pass"+" "+final_sum);
           }
           else if(final_sum>=50 &&firstLetter!='N'){
        	   System.out.println("Pass");
           }
           else if(final_sum<50 && firstLetter=='N') {
        	   final_sum+=10;
        	   if(final_sum>=50) {
        		   System.out.println("Pass"+" "+final_sum);
        	   }
        	   else {
        		   System.out.println("Fail");
        	   }
           }
           else {
        	   System.out.println("Fail");
           }
           double avg=sum/2;
           System.out.println("Average Of Student :"+avg);
	   System.out.println("Thank You");
	}

}
