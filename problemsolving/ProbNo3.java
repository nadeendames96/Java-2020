package problemsolving;

import java.util.Scanner;

public class ProbNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     String string1=in.nextLine();
     string1=string1.toLowerCase();
    char firstLetter=string1.charAt(0);
    char lastLetter=string1.charAt(string1.length()-1);
   
    if(firstLetter==lastLetter) {
    	System.out.println("Yes");
    }
    else {
    	System.out.println("No");
    }
     
	}

}
