package javabasics;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     System.out.println("please enter character:");
     char letter=in.next().charAt(0);
     System.out.println("character "+letter+" "+"is equal in "
     +(int)letter+" in ASCII System");
	}

}
