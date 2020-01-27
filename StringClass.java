package javaCourse2020;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Nadeem";
	char letter=name.charAt(0);
	//CharAt() method
	
           System.out.println(name.charAt(4));
           System.out.println(letter);
		String name2="Nadeem";
		String name3="Nadeen";
		String name4="nadeem";
	String name5="NadEem";
    
	//CompartTo() method
	
	//first role
	/*
	 * if letters or any letters in first name is uppercase (capital Letter)
	 * and letters or any letters in second name 
	 * is small will be print (-) and  
	 * distance difference between them
	 */
	
	//second role
	/*
	 * if letters in first name is equal letters (copy,paste)will be
	 * print (0)
	 */
	
	//third role
	 /*
     * if letters or any letters in first name is lowercase(small letter)
     * and letters or any letters in second name is uppercase(capital Letter)
     * will be print (+) and  
		 * distance difference between them
		 * System.out.println(name4.compareTo(name)); //32
     */
	
		System.out.println(name.compareTo(name3)); 
		
		System.out.println(name.compareTo(name2));
		
		System.out.println(name.compareTo(name4));
		
		System.out.println(name.compareTo(name));
       System.out.println(name3.compareTo(name));
       System.out.println(name4.compareTo(name));
       System.out.println(name.compareTo(new String("Nadeem")));
       
       
       //CompareToIgnoreCase() method
   	System.out.println(name.compareToIgnoreCase(name3)); 
	System.out.println(name.compareToIgnoreCase(name2));
	System.out.println(name.compareToIgnoreCase(name4));// *
	System.out.println(name.compareToIgnoreCase(name));
   System.out.println(name3.compareToIgnoreCase(name));
   System.out.println(name4.compareToIgnoreCase(name));// *
   
   /*
    * ignore uppercase letters and lowercase letters
    * in the same names
    * but will print (-,+) in deference letters
    */
   
   
   //contact() method
   
	String name6="Dames";
	String name7=name3.concat(name6);
	System.out.println(name7);
	String name8=name3.concat(" "+name6);
	System.out.println(name8);
	
	
	//+ (plus with string )
	   int number1=20;
	      int number2=30;
	      System.out.println(number1+number2);
			String num1="20";
	      String num2="30";
	      String num3=num1+num2;
	      System.out.println(num3);
	      
	      System.out.println("Addition Between Numbers :"+number1+number2);
	      System.out.println("Addition Between Numbers :"+(number1+number2));
	      
	      
	      //contains() method
	      String name9="Nadeen";
	      System.out.println(name9.contains("n"));//True because name is contain n letter
	      System.out.println(name9.contains("ee"));//True because name is contain ee letters
	      System.out.println(name9.contains("Nadeen"));//True because name is contain name letters
	      System.out.println(name9.contains("m"));//False because name is not contain m letter
	      String name10="Nadosh";
	      System.out.println(name9.contains(name10));//False because name is not contain 
	      /*
	       * some letters in second name
	       */
	      
	      
	      //containEquals() method
	      
	      System.out.println(name9.contentEquals(name10));//false
	      System.out.println(name9.contentEquals("Nadeen"));//true
	      System.out.println(name9.contentEquals(name9));//true
	      System.out.println(name9.contentEquals("n"));//false
	      System.out.println(name9.contentEquals("NADEEN")); //false
	      System.out.println(name9.contentEquals("NadEen"));  //false
	      
	      
	      //equals() method
	        System.out.println(name9.equals(name10)); //false
	         System.out.println(name9.equals(name9));//true
	         System.out.println(name9.equals("N"));//false
	         System.out.println(name9.equals("Nadeen"));//true
	         String name11="NAdeen";
	         System.out.println(name9.equals(name11));//false
	         
	         
	         //equalsIgnoreCase() method
	         
	         System.out.println(name9.equalsIgnoreCase(name10)); //false
	         System.out.println(name9.equalsIgnoreCase(name9));//true
	         String name12="NAdeen";
	         System.out.println(name9.equalsIgnoreCase(name12));//true
	         
	         
	         //IndexOf() method
	         
	         System.out.println(name9.indexOf("a"));//because position(index) a is 1
	         System.out.println(name9.indexOf("Nadeen"));
	         String name13="Nadeen Omar Dames";  
	         //What is will print?!!
	         System.out.println(name13.indexOf("Dames"));
	         //because position(index) D letter is 12
	         
	         //lastIndexOf() method
	         
	         System.out.println(name9.lastIndexOf("e"));
	         System.out.println(name10.lastIndexOf("N"));
	         
	         
	         //isEmpty() method
	         
	         String name14="";
	         System.out.println(name14.isEmpty()); //True  because name14 is empty
	         String name15="Nadosh";
	         System.out.println(name15.isEmpty());
	         
	         
	         //length() method
	         
	         System.out.println(name9.length());
	         System.out.println(name10.length());
	         
	         String name16="Mohammad";
	         int length_name=name16.length();
	         System.out.println(length_name);
	         
	         //replace() method
	         
	         System.out.println(name9.replace("N", "O"));
	         System.out.println(name9.replace(name9, name10));
	         System.out.println(name9.replace("ee", "i"));
	         
	         //replaceFirst() method
	         
	         System.out.println(name9.replaceFirst("N", name10));
	         System.out.println(name9.replaceFirst("N", "I"));
	         // why is not replace?!
	         System.out.println(name9.replaceFirst("EE", "I"));  //because replaced only first letter

	         
	         //replaceAll() method
	         
	         String name17=name10.replaceAll(name10, "NadeenDames");
	         System.out.println(name17);
	         
	         //subString
	         
	         System.out.println(name9.substring(1,3));	 //ad
	         System.out.println(name9.substring(2)); //deen
	         
	         //toCharArray() method
	         
	         char[]letter2=name9.toCharArray();
	         for (int i = 0; i < letter2.length; i++) {
	     		System.out.println(letter2[i]);
	     	}
	       	
	         
	         //toLowerCase() method
	         
	         System.out.println(name9.toLowerCase());
	         System.out.println(name10.toLowerCase());
	         String name18="NADEEN DAMES";
	         System.out.println(name18.toLowerCase());
	         
	         
	         //toUpperCase() method
	         
	         System.out.println(name9.toUpperCase());
	         System.out.println(name10.toUpperCase());
	         String name19="nadeen dames";
	         System.out.println(name19.toUpperCase());
	         
	         //toString() method
	         
	         System.out.println(name9.toString());
	         String math="Number "+(2+3);
	         System.out.println(math.toString());//System.out.println(math);
	         math="Number "+2+5;
	         System.out.println(math.toString());
	         
	         
	         //trim() method
	         
	         String name20="            Nadeen Dames                     ";
	         System.out.println(name20);
	             System.out.println(name20.trim()); //remove whitespace before and after name
	        	
	             
	             //valueOf() method
	             
	             int number=20;
	             String math2=String.valueOf(number);
	             System.out.println("Covert from integer to String");
	             System.out.println(math2);
	             
	         System.out.println("\n");
	         
	         
	         //Integer.parseInt() method
	             String number3="30";
	             int num4=Integer.parseInt(number3);
	             System.out.println("Convert from String to Integer");
	             System.out.println(num2);
	             
	             
	             //Another Methods inString Class
	             
	             //Another Methods
	             /*
	              * subSequence()
	              * intern()	
	              * hashCode()	
	              * format()	
	              * endsWith()	
	              * startsWith()
	              * split()		  Array
	              */
	             
	             System.out.println(name9.subSequence(3, 6));
	             System.out.println(name9.intern());
	             System.out.println(name9.hashCode());
	             String name21=name9.format(null, name10, args);//format(String,Object)
	             System.out.println(name21);
	             System.out.println(name9.startsWith("N"));
	             System.out.println(name9.startsWith("a"));
	             System.out.println(name10.endsWith("S"));
	             System.out.println(name10.endsWith("s"));
	             
	             
	             //Special Characters
	             
	             System.out.print("Welcome//My Friends"
	            	   		+ "/This String Class");
	            	   System.out.println(", "
	            	   		+ "String Class"
	            	   		+ " includes"
	            	   		+ " ' Many Methods'");
	            	   
	             
	          
	           
	}

}
