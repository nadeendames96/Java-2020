package javabasics;

import java.util.Scanner;

public class CodingNo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome");
          		  Scanner in=new Scanner(System.in);
          		  String day=in.nextLine();
          		  switch (day) {
				case "Sunday":
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
							case "Thrsday":
								System.out.println("Today is "+day);
								break;	
								case "Friday":
									System.out.println("Today is "+day);
									break;	
									case "Saterday":
										System.out.println("Today is "+day);
										break;

				default:
					System.out.println("day is first chracter as small");
					break;
				}
		   
	}

}
 