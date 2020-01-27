package javaCourse2020;

import java.util.Scanner;

public class Coding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Any First Name,Please:");
		String first_name=in.nextLine();
		char first_letter=first_name.charAt(0);
		System.out.println("First Character in name is "+first_letter);
		System.out.println("Contact Name With Characters or Last Name.");
		System.out.println("Enter Last Name,Please:");
		String last_name=in.nextLine();
		String full_name=first_name.concat(" "+ last_name);
		//first_name+" "+last_name
		System.out.println("Your Full Name is "+full_name);
		System.out.println("Do are Last Name Equlas 'Dames'");
		System.out.println(last_name.equals("Dames"));
		//String equals_last_name="Dames"
		//System.out.println(last_name.equals(equals_last_name));
		System.out.println("What is result If Comapare Between"
				+ "First Name And Last Name ");
		System.out.println(first_name.compareTo(last_name));
		System.out.println("Print First Name UpperCaseLetter And Last Name LowerCaseLetter.");
		System.out.println(first_name.toUpperCase()+" , "+last_name.toLowerCase());
		System.out.println("Print Lenth of First Name And Last Name");
		System.out.println(first_name.length()+" + "+last_name.length());
		int add=first_name.length()+last_name.length();
		System.out.println("Addition "+add);
		System.out.println("Ok,Thanks...");



		


		
		

	}

}
