package javaCourse2020;

import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number 1 And Number 2:");
		int numbre1=in.nextInt();
		double number2=in.nextDouble();
		System.out.println(("Absulate Function ")+Math.abs(numbre1));
		System.out.println(("Absulate Function ")+Math.abs(number2));
		
		System.out.println("Cube Function "+Math.cbrt(numbre1));
		System.out.println(("Function ")+Math.cbrt(number2));
		
		System.out.println("Ceil Function " +Math.ceil(numbre1));
		System.out.println("Ceil Function " +Math.ceil(number2));
		
		System.out.println("Floor Function "+Math.floor(numbre1));
		System.out.println("Floor Function "+Math.floor(number2));
		
		
		
		

	}

}
