package javabasics;

import java.util.Scanner;

public class StringProblemPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * enter tow string by user
		 * first print summation of length A + length B Strings
		 * comapreTo if chracters in string a greather than 
		 characters in string b
		
		 *print first character both string a and b uppercase 
		 *and then print two string in single line and sperated 
		 *space between this
		 * 
		 */
		Scanner in=new Scanner(System.in);
		String A=in.nextLine();
		String B=in.nextLine();
		A=A.toLowerCase();
		B=B.toLowerCase();
		
		//First Way
		System.out.println(A.length()+B.length());
		
		//Second Way
		
		//int len1=A.length();
		//int len2=B.length();
		//		System.out.println(len1+len2);
		int compare1=A.compareTo(B);
		int cpmapre2=B.compareTo(A);
		
	if(compare1>cpmapre2) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	    char firstLeteerA=A.charAt(0);
	    char firstLetterB=B.charAt(0);
		System.out.println(Character.toUpperCase(firstLeteerA)+A.substring(1)+" "+Character.toUpperCase(firstLetterB)+B.substring(1));


	}

}
