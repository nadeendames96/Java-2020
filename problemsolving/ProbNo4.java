package problemsolving;

import java.util.Scanner;

public class ProbNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		           
		
		    Scanner in =new Scanner(System.in);
		    int n=in.nextInt();
		    
                     
                      // if n is odd
		    if(n%2!=0) {
		    	System.out.println("weird");
		    }
		                 
                    
                      //if n inclusive range from 2 to 5 and n is even
		    else   if(n%2==0 &&n>=2 && n<=5) {
		    	System.out.println("not weird");
		    }
                     
                      
                      //if n is even and inclusive range  from 6 to 20
		    
		    else if(n%2==0 && n>=6 && n<=20) {
                    	  System.out.println("weird");
                      }
                      
                      
                      //if n greater than 20 
		    else {
          	  System.out.println("not weird");
            }
                      
                      

	}

}
