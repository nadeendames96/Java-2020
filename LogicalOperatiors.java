package javaCourse2020;

import java.util.Scanner;

public class LogicalOperatiors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Please Enter Number:");
		double number=in.nextDouble();
		System.out.println("&& Operators Results :");
		System.out.println(number <30 && number>0);   // true && true=T
		System.out.println(number >5 && number<10);  //true && false=F
		System.out.println(number <5 && number<10); //false && true=F
		System.out.println(number >20 && number<0); //false && false=F
		System.out.println("\n");
		System.out.println("|| Operators Results :");
		System.out.println(number <30 || number>0);   // true || true=T
		System.out.println(number >5 || number<10);  //true || false=T
		System.out.println(number <5 || number<10); //false || true=T
		System.out.println(number >20 || number<0); //false || false=F
	    System.out.println("\n");
		System.out.println("! Operators Results :");
		System.out.println(!(number>2));   // true = false
		System.out.println(!(number<0));  //false=true
	
		
		
	}

}
