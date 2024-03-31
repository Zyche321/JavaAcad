import java.util.Scanner;
public class MidnightMadness {
	public static void main(String[] args) {
		final float discountMidnight = 4, normAdult = 8, matineeAdult = 5, normChild = 4, childMatinee = 2;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.print("Enter current time in Military Time (exe. 4:30PM is 1630): ");
		int time = scan.nextInt();
      
		if (age > 13) {
         		if (time > 2200)
            			System.out.printf ("The price of the ticket is $%.2f", discountMidnight);
			else if (time >= 100 && time <= 1700)
				System.out.printf ("The price of the ticket is $%.2f", matineeAdult);
			else
				System.out.printf ("The price of the ticket is $%.2f", normAdult);
		}
		else {
        		if (age < 13 && time > 2200)
           		 	System.out.print ("You're not allowed to buy ticket");
			 else {
            			if (time >= 100 && time <= 1700)
			   		System.out.printf ("The price of the ticket is $%.2f", childMatinee);
			   	else
		   			System.out.printf ("The price of the ticket is $%.2f", normChild);

            		 }
      	 	 }
	}
}
