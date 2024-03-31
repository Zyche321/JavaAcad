import java.util.Scanner;
public class SteamEngineEfficency {
	public static void main(String[] args) {
		
		double efficiency = 0.0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Air Temperature (in Kelvin): ");
		double Tair = scan.nextFloat();
		System.out.print("Enter Steam Temperature (in Kelvin): ");
		double Tsteam = scan.nextFloat();
		
		if (Tsteam >= 373)
			efficiency = 1.0 - Tair / Tsteam;
		scan.close();
		
		System.out.printf("The maximum possible efficiency: %%%f", efficiency);
	}
}
