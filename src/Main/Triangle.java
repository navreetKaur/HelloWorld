package Main;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		// get three sides of Triangle
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter three sides of triangle");
					double side1 = scan.nextDouble();
					double side2 = scan.nextDouble();
					double side3 = scan.nextDouble();
					
					if(checkEquilateral(side1,side2,side3))
						System.out.println("Equilateral Triangle");
					else {
						System.out.println("Not an Equilateral");
						if (checkRightAngled(side1,side2,side3))
							System.out.println("Right Angled Triangle");
						else
							System.out.println("Not a Right Angled Triangle");
					}
					scan.close();
	}

	private static boolean checkRightAngled(double side1, double side2,
			double side3) {
		
		
		return ((side1*side1) == (side2*side2 + side3* side3) || 
				(side2*side2) == (side1*side1 + side3* side3) ||
				(side3*side3) == (side2*side2 + side1* side1));
	}

	private static boolean checkEquilateral(double side1, double side2,
			double side3) {
		return (side1 == side2 || side2 == side3 || side3 == side1);
	}
	
}
