package javaCourse2020;

import java.util.Scanner;

public class CodingNo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in =new Scanner(System.in);
     System.out.println("Enter Any Day In The Week,alse first chracter must be "
     		+ "UPPERCASE");
		String day=in.nextLine();
		switch (day) {
		case "Friday":
			System.out.println("Today is "+day);
			break;
		case "Sunday":
			System.out.println("Today is "+day);
			break;
			case "Saterday":
				System.out.println("Today is "+day);
				break;
				case "Monday":
					System.out.println("Today is "+day);
					break;
					case "Tuesday":
						System.out.println("Today is "+day);
						break;
						case "Wendesday":
							System.out.println("Today is "+day);
							break;
						case "Tresday":
							System.out.println("Today is "+day);
							break;
		default:
			System.out.println("You Enter First Character In Day 'lowercase letter'");
			break;
		}
		 System.out.println("Enter Any Day In The Week,alse first chracter must be "
		     		+ "UPPERCASE");
				 day=in.nextLine();
				switch (day) {
				case "Friday":
					System.out.println("Today is "+day);
					break;
				case "Sunday":
					System.out.println("Today is "+day);
					break;
					case "Saterday":
						System.out.println("Today is "+day);
						break;
						case "Monday":
							System.out.println("Today is "+day);
							break;
							case "Tuesday":
								System.out.println("Today is "+day);
								break;
								case "Wendesday":
									System.out.println("Today is "+day);
									break;
								case "Tresday":
									System.out.println("Today is "+day);
									break;
				default:
					System.out.println("You Enter First Character In Day 'lowercase letter'");
					break;
				}
	}

}
