package javaCourse2020;

import java.util.Scanner;

public class JavaFirstExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		/*Suppose name variables is number_one,number_tow
		*Suppose value of number_one is equal 20.4,and value of number_tow is equal 4.20
	   */
		System.out.println(" Information :Suppose name variables is number_one,number_tow\r\n" + 
				"Suppose value of number_one is equal 20.4,and value of number_tow is equal 4.20\r\n" + 
				"	   ");
		System.out.println('\n');
	   System.out.println("Declare tow numbers('double type') and allow user to enter this variables");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number One,Please:");
		   double number_one=in.nextDouble();
			System.out.println("Enter Number Tow,Please:");
		   double number_tow=in.nextDouble();
		   System.out.println("Do are vlaue in number_one variable equlas vlaue in number_tow variables?");
		   System.out.println(number_one==number_tow);
		   System.out.println("Please add the number 4 in variable number_one and add the 2 number in variable number_tow");
		   number_one+=4;
		   number_tow+=2;
		   System.out.println("Ceiling number_one equal"+" "+Math.ceil(number_one));
		   System.out.println("Rounding number_tow equal"+" "+Math.round(number_tow));
		   System.out.println("The maximum value between number_one and number_tow is"+" "+Math.max(number_one, number_tow));
		   System.out.println("The manimum value between number_one and number_tow is"+" "+Math.min(number_one, number_tow));
            System.out.println("\n \t"+" The End Program");
		   
	}

}
