package javaCourse2020;

import java.util.Scanner;

public class Coding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Any First Name,Please:");
		String first_name=in.nextLine();
		System.out.println("Enter Last Name,Please:");
		String last_name=in.nextLine();
		String full_name=first_name.concat(" "+ last_name);
		//first_name+" "+last_name
		System.out.println("Your Full Name is "+full_name);
		System.out.println("Check If First Name Is Contains 'ee'");
		System.out.println(first_name.contains("ee"));
		//String check_contains="ee";
		//System.out.println(first_name.contains(check_contains));
		System.out.println("What are Position in first Letter in First Name is 'N'");
		System.out.println(first_name.indexOf("N"));
		//String firstLetter="N";
		//System.out.println(first_name.indexOf(firstLetter));
		System.out.println("What are position in last Letter in First Name is 'n'");
		System.out.println(first_name.lastIndexOf("n"));
		//String lastLetter="o";
		//System.out.println(first_name.lastIndexOf(lastLetter));
		System.out.println("What are position in last Letter in First Name is 'o'");
		System.out.println(first_name.lastIndexOf("o"));
		System.out.println("Do are First Name is Empty?");
		System.out.println(first_name.isEmpty());
		System.out.println("Replace First Letter in First Name To 'm'");
		System.out.println(first_name.replace(first_name.charAt(0),'m'));
		System.out.println("Print SubString  From First Name And Last Name Between 5 to 10");
		System.out.println(full_name.substring(5,10));
		System.out.println("Declare Double Value Enter By User And Convert To String");
		System.out.println("Enter Value Double,Please:");
		double value=in.nextDouble();
		System.out.println(String.valueOf(value));
		

	}

}
