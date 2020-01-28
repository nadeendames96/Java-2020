package javabasics;

import java.util.Scanner;

public class CodingJavaLecture6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare firstname and lastname and enter by user
		 * declare fullname and print fullname
		 * check if firstname contains 'ee'
		 * return index 'n' in firstname
		 * return index'0' in firstname
		 * firstname is empty or no
		 * replace first character in first name 'm'
		 *  declare diuble value enter by user and convert to string 
		 *  print this value
		 */
		Scanner in=new Scanner(System.in);
		String firstname=in.nextLine();
		String lastname=in.nextLine();
		String fullnamne=firstname+lastname;
		System.out.println(fullnamne);
		System.out.println(firstname.contains("ee"));
		System.out.println(firstname.lastIndexOf(firstname.charAt(firstname.length()-1)));
		System.out.println(firstname.indexOf("o"));
	System.out.println(firstname.isEmpty());
	System.out.println(firstname.replace("N", "M"));
	double value=in.nextDouble();
	System.out.println(String.valueOf(value));
	
		

	}

}
