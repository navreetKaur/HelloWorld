package Adventure;

import java.util.Scanner;

public class AdventureGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to WonderLand!");
		System.out.println("Would you like to visit sindabad's ship (Y) or rabbit's hole (N)?");
		String input = in.next();
		if (input.equals("Y")) {
			System.out.println("Would you like to visit captain's cabin (Y) or engine room (N)?");
			input = in.next();
			if (input.equals("Y")) {
				System.out.println("Would you like to open the cabinate (Y) or move the stairing (N)?");
				input = in.next();
				if (input.equals("Y")) {
					System.out.println("You got a Diamond Crown!!");
				} else {
					System.out.println("You move to the Giant peple world!!");
				}
			} else {
				System.out.println("Would you like to push the red button (Y) or enter the dark room (N)?");
				input = in.next();
				if (input.equals("Y")) {
					System.out.println("You got went under water deep into the sea!!");
				} else {
					System.out.println("You meet a ghost!!");
				}
			}
		} else {
			System.out.println("Would you like to visit rabit's bedroom (Y) or living room (N)?");
			input = in.next();
			if (input.equals("Y")) {
				System.out.println("Would you like to open the curtains (Y) or open the trap door (N)?");
				input = in.next();
				if (input.equals("Y")) {
					System.out.println("You see elephants flying!!");
				} else {
					System.out.println("You move enter a palace!!");
				}
			} else {
				System.out.println("Would you like to drink tea (Y) or touch the painting (N)?");
				input = in.next();
				if (input.equals("Y")) {
					System.out.println("You are tiny now!!");
				} else {
					System.out.println("You enter the world of insects!!");
				}
			}
		}
		in.close();
	}

}
