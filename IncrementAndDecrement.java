package javaCourse2020;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Increment:");
		int number=5;
			System.out.println("++number : "+(++number));   //number=6
		System.out.println("number ++ : "+(number++));   //number=6
		number++;    //number=8
		System.out.println(number);
		++number;     //number=9
		System.out.println(number);
		System.out.println("\n");
		System.out.println("Decrement:");
		double number2=2.0;
		System.out.println("--number2 : "+(--number2));   //number=1.0
		System.out.println("number2 -- : "+(number2--));   //number=1.0
		number2--;    //number=-1.0
		System.out.println(number2);
		--number2;     //number=-2.0
		System.out.println(number2);
		

	}

}
