package javaCourse2020;

import java.util.Scanner;

public class HomeworkL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
   Scanner in=new Scanner(System.in);
	System.out.println("Welcome for Unit Convertor...Please Enter 2 Values Double Type From  User");
	System.out.println("Please Mrs Coverter From g(ghram) to kg(kilo ghram),And From kg(kilo ghram)to g(ghram)");
	System.out.println("Note : 1Kg = 1000g");
	System.out.println("Enter Value No.1 of unit (g),Please");
	double num1=in.nextDouble();
	double con_from_g_to_kg=num1/1000;
	System.out.println("The Final Converot From g To kg After Rounding "+Math.round(con_from_g_to_kg)+"  Kg");
	System.out.println("Enter Value No.2 of unit (kg),Please");
	double num2=in.nextDouble();
 	double con_from_kg_to_g=num2*1000;
	System.out.println("The Final Converot From kg To g  After Ceiling "+Math.ceil(con_from_kg_to_g)+"  g");
	
	
	}

	}


