package javaCourse2020;

public class CodingNo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write The Program To Print  Only Odd Number 

		
		  //For Loop
		for (int i = 1; i < 20; i++)      {
			
			//code block
			
			if(i%2!=0) {
				System.out.println(i);

				break;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("Goodbuy");
		/*int i=0;
		while (i<20) {
			  //code block
			if(i%2!=0)
			System.out.println(i);
			//inc/dec  
			i++;
			
		}*/
		
		/*int i=1;

		do {
			//code block
			if(i%2!=0) {
				System.out.println(i);
				
			}
			i++;
			
		} while (i<20);
		  
	}*/
	}

}
