package javaCourse2020;

import java.util.Scanner;

public class MathClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number 1 And Number 2:");
		int numbre1=in.nextInt();
		double number2=in.nextDouble();
		System.out.println("Min Function "+Math.min(numbre1, number2));
		System.out.println("Max Function  "+Math.max(numbre1, number2));
		System.out.println("Round Function "+Math.round(numbre1));
		System.out.println("Round Function "+Math.round(number2));
		System.out.println("Power Function "+Math.pow(numbre1, number2));
		System.out.println("Sequare Root Function "+Math.sqrt(numbre1));
		System.out.println("Sequare Root Function "+Math.sqrt(number2));

	}

}
