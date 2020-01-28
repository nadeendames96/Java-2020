package javabasics;

import java.util.Scanner;

public class StringProbPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String A=in.nextLine();
		A=A.toLowerCase();
		char fisrtChar=A.charAt(0);
		char lastChar=A.charAt(A.length()-1);
		if(fisrtChar==lastChar) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
