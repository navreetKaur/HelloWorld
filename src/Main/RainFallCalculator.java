package Main;

import java.util.Scanner;

public class RainFallCalculator {

	public static void main(String[] args) {
		// get dimensions and rain in inches
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width of roof in inches");
		double width = scan.nextDouble();
		System.out.println("Enter height of roof in inches");
		double height = scan.nextDouble();
		System.out.println("Enter rain fall in inches");
		double rainFall = scan.nextDouble();
		
		double waterFlow = calculateWaterFlow(rainFall,height,width);
		System.out.println("Water Fall: " + waterFlow);
		

	}

	private static double calculateWaterFlow(double rainFall, double height,
			double width) {
		return (rainFall*width*height) / 231;
	}

}
