package Chapter24;
import java.util.Scanner;
public class SheepHerdSize {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double power = 1.0;
		int yearsSupervision = 0;
		
		 for (int t = 0; t <= 25; t++) {
	           double N =  220/(1 + 10 * power);
	           System.out.printf("Year: %2d\tNumber of sheep %.2f\n", t, N);
	           
	           if (N < 80) 
	        	   yearsSupervision = t;
	           power *= 0.83;
		 }
		 System.out.println("The sheep herd must be supervised for at least " + yearsSupervision + " years.");
	}
}