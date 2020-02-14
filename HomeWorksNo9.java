package javaCourse2020;

import java.util.Scanner;

public class HomeWorksNo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Counter Number :");
		Scanner in=new Scanner(System.in);
		
		int counter=in.nextInt();
		System.out.println("Counter : ");
		  for (int i = 0; i < 20; i++) {
			if(i%2==0) {
				System.out.print(counter+" ");
				counter+=2;
				
			}
			
		}
		  System.out.println("\n");
		  System.out.println("Alphabatic Capital Letters");
		  char letter_capital='A';
           while (letter_capital<='Z') {
		System.out.print(letter_capital+" ");
		letter_capital++;
			
		}
           System.out.println("\n");
 		  System.out.println("Alphabatic Small Letters");
 	
           char letter_small='a';
           do {
        	   System.out.print(letter_small+" ");
        	   letter_small++;
           }
           while(letter_small<='z');
	}

}
