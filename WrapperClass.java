package javaCourse2020;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Integer number=5;
         String num="4";
         System.out.println(number.valueOf(num));
         int x1=number.intValue();
         System.out.println(number.intValue());
         System.out.println(x1);
     int x2=50;
            number=Integer.valueOf(x2);
            System.out.println(number);
            number=Integer.max(x1, x2);
            System.out.println(number);
            number=Integer.min(x1, x2);
            System.out.println(number);
            System.out.println(number);
      System.out.println(number.SIZE);

	}

}
