package javabasics;

import java.util.Scanner;

public class PrintUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter Your Name:");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
	        System.out.println("Welcome "+name);
	}

}
