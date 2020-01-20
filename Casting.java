package javaCourse2020;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double salary=20;  /*
       because double size =64 byte greather than 
       int size=32 byte
   */
   System.out.println(salary);
   
   int number=(int)125.6;   /*error because not allow convertor 
   *    from int to double because int size=32 byte
   *    is less than double size =64 byte
   */
   long number5=5565968599556565656L;
   float number3 =1458.5f;
   
   long number2=(long)154546566145.5;
   float number4=(float)463.5;
   
	}

}
