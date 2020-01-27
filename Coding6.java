package javaCourse2020;

import java.util.Scanner;

public class Coding6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create variable string datatype name firstname and enter by user
		 * print first character in firstname
		 * create lastnaem variable datatype string enter by user and contact with firstname
		 * crate new variable name fullname and save contact between firstname and lastname
		 * compare between lastname and "Dames" string by using equlas method
		 * return result by compareTo firstname and lastname
		 * print firstname 	Uppercase,lastname LowerCase
		 * print lengths of firstname and lastname
		 * print Addition and sum value from length of firstname and length of lastname
		 * print "Ok...Thanks..."
		 */ 

		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Firstname:");
		String firstname=in.nextLine();
		System.out.println("Firsr Chracter in Firstname:");
		System.out.println(firstname.charAt(0));
		System.out.println("Enter Your Lastname:");
		String lastname=in.nextLine();
		System.out.println("Print Fullname After Contanate:");
		String fullname=firstname.concat(lastname); //=firstname+lastname;
		System.out.println(fullname);
		System.out.println("Do are Lastname is equals 'Dames'?!");
		System.out.println(lastname.equals("Dames"));
		System.out.println("Compare To Between Firstname and Lastname");
           		System.out.println(firstname.compareTo(lastname));
           		System.out.println("Print Firstnaem in Uppercase And Lastname in Lowercase");
           		System.out.println(firstname.toUpperCase()+" "+lastname.toLowerCase());
           		System.out.println("Print length of Firstname And Lastname");
           		System.out.println(firstname.length()+" "+lastname.length());
           		int len1=firstname.length();
           		int len2=lastname.length();
           		System.out.println("Additions Between Numbers:");
           		System.out.println("Addition ="+" "+(len1+len2));
           		System.out.println("Ok...Thanks");
		
}

}
