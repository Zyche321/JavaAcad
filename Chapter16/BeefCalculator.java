package JAVA_ACAD.Chapter16;
import java.util.Scanner;
public class BeefCalculator {

	public static void main(String[] args) {
		
		Scanner ducay = new Scanner (System.in);
		
		System.out.println("Price per pound package A:");
		float PriceA = ducay.nextFloat();
		System.out.println("Percent lean package A:");
		int leanA = ducay.nextInt();
		System.out.println("Price per pound package B:");
		float PriceB = ducay.nextFloat();
		System.out.println("Percent lean package B:");
		int leanB = ducay.nextInt();
		
		double costA = PriceA / (leanA / 100.0);
		double costB = PriceB / (leanB / 100.0);

		System.out.printf("\nPackage A cost per pound of lean: %.2f ", costA);
		System.out.printf("\nPackage B cost per pound of lean: %.6f ", costB);
		
		if (costA < costB)
			System.out.printf("\nPackage A is the best value");
		else
			System.out.printf("\nPackage B is the best value");
	}
}