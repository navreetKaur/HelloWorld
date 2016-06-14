package Receipt;

import java.util.Scanner;

public class InvoiceApp {
	public static void main(String[] args) {
		double rates[] = new double[50];int i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Tax rate:");
		double TaxRate = in.nextDouble();
		double total = 0.0;
		while (true) {
			System.out.println("Enter Price:");
			double tmp = in.nextDouble();
			if (tmp == 0.0) {
				break;
			}
			rates[i] = tmp;
			i++;
			total += tmp;
		}
		System.out.printf("Tax rate?: %.02f", TaxRate);
		System.out.println();
		for (int k =0; k< i; k++) {
			System.out.println("Price # " + (k+1) + " " + rates[k]);
		}
		System.out.println("--------------------------------------------");
		System.out.println("Receipt");
		for (int k =0; k< i; k++) {
			System.out.printf("%.02f", rates[k]);
			System.out.println();
		}
		System.out.printf("%.02f SubTotal", total);
		System.out.println();
		System.out.printf("%.03f total Tax", (total*TaxRate));
		System.out.println();
		System.out.printf("%.02f Grand Total", (total+(total*TaxRate)));
	}

}
