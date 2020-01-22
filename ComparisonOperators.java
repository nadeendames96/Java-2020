package javaCourse2020;

import java.util.Scanner;

public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number,Please:");
		int number=in.nextInt();
		System.out.println(number==1);   //5==1  false
		System.out.println(number>=1);     //5>=1   true
		System.out.println(number<=1);   //5<=1    false
		System.out.println(number>5);   //5>5   false
		System.out.println(number<5);   //5<5    false

	}

}
