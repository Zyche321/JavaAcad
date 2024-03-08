package Chapter17;
import java.util.Scanner;
public class InternetDelicatessen {

	public static void main(String[] args) {
		
		final double regularDelivery = 10.0, addFee = 2.00, expressDelivery = 3.00, deliveryFee, total;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the item: ");
		String productName = scan.nextLine();
		System.out.print("Enter the price: ");
		double productPrice = scan.nextFloat();
		System.out.print("Overnight Delivery? (Press 0 if NO, 1 if YES): ");
		int deliveryCondition = scan.nextInt();
		
		if (productPrice < regularDelivery) {
			if (deliveryCondition == 0) {
				deliveryFee = addFee;
				total = productPrice + deliveryFee;
			}
			else {
			    deliveryFee = addFee + expressDelivery;
				total = productPrice + deliveryFee;
			}
		}
		else {
			if (deliveryCondition == 1) {
				deliveryFee = expressDelivery;
				total = productPrice + deliveryFee;
			}
			else {
				deliveryFee = 0;
				total = productPrice;
			}
		}
		
		System.out.println("Invoice:");
		System.out.printf("\t%s\t%.2f\n", productName, productPrice );
		System.out.printf("\tDelivery\t%.2f\n", deliveryFee);
		System.out.printf("\tTotal\t\t%.2f\n", total);
	}
}