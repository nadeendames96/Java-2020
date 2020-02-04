package javabasics;

import java.util.Scanner;

public class JavaExamCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter Your Firstname Please :");
		 String firstname =in.nextLine();
		 System.out.println("Enter Your Lastname please :");
		 String lastname=in.nextLine();
		 System.out.println("Enter  character by user: ");
		 char character=in.next().charAt(0);
		 System.out.println("Declare Fullname and contact firstname and lastname and save inside fullname variable :");
		 String fullname=firstname+lastname;// firstname.contact(lastname);
		 System.out.println("Fullname is"+"\t"+fullname);
		 System.out.println("Do are fullname contains chracter 'N'");
		 System.out.println(fullname.contains("N"));
		 System.out.println("Please return  first position(index) chracter 'N'  from fullname");
		 System.out.println(fullname.indexOf("N"));
		 System.out.println("Do are lastname variable is empty ?");
		 System.out.println(lastname.isEmpty());
		 System.out.println("Replace firstname to lastname and lastname to firstname");
		 System.out.print(firstname.replace(firstname, lastname));
		 System.out.println(" "+lastname.replace(lastname, firstname));
		 System.out.println("Please Addition length numbers of firstname and lastname,Convert Numbers to string object  And print Addition between this");
		 int len1=firstname.length();
		 int len2=lastname.length();
		 String add="";
		  add=add.valueOf(len1+len2);
		 System.out.println("Addition "+" = "+add);
		
	}

}
