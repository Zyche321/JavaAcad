package Chapter22;
import java.util.Scanner;
public class ShippingCostSimulator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double shippingCost = 0;
		System.out.println("Weight of Order:");
		int weight = scan.nextInt();
		
		while (weight != 0) {
			if (weight >= 10) {
				System.out.printf("Shipping Cost: $%.2f\n", (weight - 10) * 0.25 + 3.0);
			}
			else 
				System.out.printf("Shipping Cost: $%.2f\n", 3.0);
			System.out.println("\nWeight of Order:");
			weight = scan.nextInt();
		}
		System.out.print("bye");
	}
}