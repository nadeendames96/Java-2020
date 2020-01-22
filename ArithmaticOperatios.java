package javaCourse2020;

import java.util.Scanner;

public class ArithmaticOperatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Number 1 And Nuber 2 :");
		int num1=in.nextInt();
		int num2=in.nextInt();
		System.out.println("Addition   : "+(num1+num2));  //num=3,num2=3,Addition:6
		//System.out.println("Addition   : "+num1+num2);  //num=3,num2=3,Addition:33
		System.out.println("Subtraction :"+(num1-num2));
		System.out.println("Multiplication :"+(num1*num2));
		System.out.println("Division :"+(num1/num2));
      System.out.println("Modulus : "+(num1%num2));
      
      System.out.println("\n");
      System.out.println("Addition   : "+(num1+num2));  //num=3,num2=3,Addition:6
		System.out.println("Addition   : "+num1+num2);  //num=3,num2=3,Addition:33
	
	}

}
