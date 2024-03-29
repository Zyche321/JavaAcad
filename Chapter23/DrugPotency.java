package Chapter23;
import java.util.Scanner;
public class DrugPotency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double disregard = 50.0, effectiveness = 100.0;
		int month = 0;
		
		while (disregard < effectiveness) {
			System.out.println("Month: "+month+"\teffectiveness: "+effectiveness);
			double expiration = effectiveness * 0.04;
			effectiveness = effectiveness - expiration;
			month += 1;
		}
		System.out.println("Month: "+month+"\teffectiveness: "+effectiveness+" DISCARDED");
	}
}