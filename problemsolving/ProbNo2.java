package problemsolving;

import java.util.Scanner;

public class ProbNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String A=in.nextLine();
		String B=in.nextLine();
		int sum=A.length()+B.length();
		System.out.println(sum);
		int compare=A.compareTo(B);
		int compare2=B.compareTo(A);
		if(compare>compare2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
      char first_A_Letter=A.charAt(0);
      char first_B_Letter=B.charAt(0);
      int len1=A.length();
      int len2=B.length();
      System.out.println(Character.toUpperCase(first_A_Letter)+A.substring(1,len1)+" "+Character.toUpperCase(first_B_Letter)+
    		  B.substring(1,len2));

      
	}

}
