package Main;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 String firstInitial = keyboard.next();
		 String lastName = keyboard.next(); 
		 String houseNumber = keyboard.next();
		 String streetName = keyboard.next();
		 String streetType = keyboard.next();
		 String city = keyboard.next();
		 
		 System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		 System.out.println(streetName + " " + streetType + " " + city);
		 
//		 System.out.println("Please Enter your Pet's name, breed and age separated by a space");
	        String name;
	        String breed;
	        int age;

	        System.out.print( "Greetings. What is your pet's name? " );
	        name = keyboard.next();
	 
	        System.out.print( "What kind of animal is " + name + "? " );
	        breed = keyboard.next();
	        
	        System.out.print( "How old is " + name + "? ");
	        age = keyboard.nextInt();
	        
	        System.out.println( name + " is your " + breed + " and it is " + age );
	}
	 

}
