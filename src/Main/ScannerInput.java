package Main;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your test score: ");
		int score = keyboard.nextInt();
		char grade = 'F';// I'm not hopeful

		if (score > 89)
			grade = 'A';
		else if (score > 79)
			grade = 'B';
		else if (score > 69)
			grade = 'C';
		else if (score > 60)
			grade = 'D';
		else
			grade = 'F';

		if (score > 69)
			System.out.println("Very good! You don't have to retake the exam!");
		else
			System.out.println("Did you even look at the book?");
		if (score % 10 >= 0 && score % 10 <= 2)

			System.out.println("Your grade " + grade + "-");
		else if (score % 10 >= 7 && score % 10 <= 9)

			System.out.println("Your grade " + grade + "+");
		else
			System.out.println("Your grade: " + grade);

		double num1, num2, num3;

		System.out.print("First temperature? ");
		num1 = keyboard.nextDouble();

		System.out.print("Second temperature? ");
		num2 = keyboard.nextDouble();

		System.out.println("The average value is : " + (num1 + num2) / 2);

		// double num1, num2, num3;

		System.out.print("First integer? ");
		num1 = keyboard.nextDouble();

		System.out.print("Second integer? ");
		num2 = keyboard.nextDouble();

		System.out.print("Third integer? ");
		num3 = keyboard.nextDouble();

		System.out.println("The total is : " + (num1 + num2 + num3));
		String firstInitial = keyboard.next();
		String lastName = keyboard.next();
		String houseNumber = keyboard.next();
		String streetName = keyboard.next();
		String streetType = keyboard.next();
		String city = keyboard.next();

		System.out.print(firstInitial + " " + lastName + " " + houseNumber
				+ " ");
		System.out.println(streetName + " " + streetType + " " + city);

		// System.out.println("Please Enter your Pet's name, breed and age separated by a space");
		String name;
		String breed;
		int age;

		System.out.print("Greetings. What is your pet's name? ");
		name = keyboard.next();

		System.out.print("What kind of animal is " + name + "? ");
		breed = keyboard.next();

		System.out.print("How old is " + name + "? ");
		age = keyboard.nextInt();

		System.out.println(name + " is your " + breed + " and it is " + age);
	}

}
