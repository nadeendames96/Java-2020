package javaCourse2020;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
       System.out.println("Enter Any Statement LowerCase:");
       String sta=in.nextLine();
      // sta=sta.toLowerCase();
       System.out.println("Add 'is Perfect ' in the statement");
       System.out.println(sta.concat(" "+" This is Perfect"));
       System.out.println("Do are sta is equals 'I Love Java' ");
       System.out.println(sta.equals("I Love Java"));
       System.out.println("Please print first letter is UpperCase");
       char first_letter=sta.charAt(0);
       System.out.println(Character.toUpperCase( first_letter));
       System.out.println("Please print last Letter is UpperCase ");
      char last_letter=sta.charAt(sta.length()-1);
      System.out.println(Character.toUpperCase(last_letter));
       
       
	}

}
