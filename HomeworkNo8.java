package javabasics;

import java.util.Scanner;

public class HomeworkNo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
	     System.out.println("Enter Any Day In The Week,and "
	    		 +"convert chracters in string to lowercase"
	     		+ " but must be first chracter "
	     		+ "UPPERCASE");
			String day=in.nextLine();
			day=day.toLowerCase();
			char first=day.charAt(0);
			String day_new=Character.toUpperCase(first)+day.substring(1);
			System.out.println(day_new);
			switch (day_new) {
			case "Friday":
				System.out.println("Today is "+day_new);
				break;
			case "Sunday":
				System.out.println("Today is "+day_new);
				break;
				case "Saterday":
					System.out.println("Today is "+day_new);
					break;
					case "Monday":
						System.out.println("Today is "+day_new);
						break;
						case "Tuesday":
							System.out.println("Today is "+day_new);
							break;
							case "Wendesday":
								System.out.println("Today is "+day_new);
								break;
							case "Tresday":
								System.out.println("Today is "+day_new);
								break;
			default:
				System.out.println("You Enter First Character In Day 'lowercase letter '"+day);
				break;
			}
			 System.out.println("Enter Any Day In The Week,alse first chracter must be "
			     		+ "UPPERCASE");
					 day=in.nextLine();
					switch (day_new) {
					case "Friday":
						System.out.println("Today is "+day_new);
						break;
					case "Sunday":
						System.out.println("Today is "+day_new);
						break;
						case "Saterday":
							System.out.println("Today is "+day_new);
							break;
							case "Monday":
								System.out.println("Today is "+day_new);
								break;
								case "Tuesday":
									System.out.println("Today is "+day_new);
									break;
									case "Wendesday":
										System.out.println("Today is "+day_new);
										break;
									case "Tresday":
										System.out.println("Today is "+day_new);
										break;
					default:
						System.out.println("You Enter First Character In Day 'lowercase letter'"+day);
						break;
					}

	}

}
