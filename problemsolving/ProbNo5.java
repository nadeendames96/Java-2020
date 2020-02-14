package problemsolving;

import java.util.Scanner;

public class ProbNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in=new Scanner(System.in);
			int number=in.nextInt();
			for (int i = 1; i <=10; i++) {
				int res=number*i;
				System.out.println(number+" * "+i+" = "+res);
			}
		

	}

}
