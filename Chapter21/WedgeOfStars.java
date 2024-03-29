package Chapter21;
import java.util.Scanner;
public class WedgeOfStars {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Initial number of stars: ");
		int times = scan.nextInt();
		
		int i = 0, j = 0, f = 1, stars = times;
		
		while (i < times) {
			while (f <= stars) {
				System.out.print("*");
				f++;		
			}
			System.out.println();
			stars--;
			f = 1;
			i++;
		} 
	}
}
