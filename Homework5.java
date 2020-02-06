package javaCourse2020;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Full Name contain 12 letters or more ,Please");
		String full_name=in.nextLine();
	   System.out.println("Please Check If Full Name Contains Character'N'");
	   System.out.println(full_name.contains("N"));
	   System.out.println("Please Check If Full Name Contains Character'O'");
	   System.out.println(full_name.contains("O"));
	   System.out.println("Please Check If Full Name Contains Character'sh'");
	   System.out.println(full_name.contains("sh"));
	   System.out.println("Please Replace 'Last Name' To 'she/he is perrfect'");
	   System.out.println(full_name.replace("Dames", ",she/he is perfect"));
	   System.out.println("Print Full Name From index 4 to Index 10 ,Please");
          System.out.println("Full Name Is :"+full_name.substring(3,10));
          System.out.println("Declare Double Value type and Convert To String");
          System.out.println("Enter Value double type:");
          double value=in.nextDouble();
          System.out.println("Convert From Double Type To String: "+String.valueOf(value));
	System.out.println("\tThe End");
	}

}
