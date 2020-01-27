package javaCourse2020;

import java.util.Scanner;

public class codingL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Converter Program from chracter to ASCII system");		
		System.out.println("Identify variable type char and enter by user");
		System.out.println("Enter character:");
		char a=in.next().charAt(0);
		System.out.println("The chracter "+a+" = "+(int)a+ " in ASCII");

	}
	

}
