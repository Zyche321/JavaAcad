import java.util.Scanner;
public class OrderChecker {
    public static void main(String[] args) {

        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        Scanner ducay = new Scanner (System.in);

        System.out.print("Number of bolts: ");
        int bolts = ducay.nextInt();
        System.out.print("Number of nuts: ");
        int nuts = ducay.nextInt();
        System.out.print("Number of washers: ");
        int washers = ducay.nextInt();

        if (bolts > nuts)
            System.out.println("\nCheck the Order: too few nuts\n");
        else if (bolts * 2 > washers)
            System.out.println("\nCheck the Order: too few washers\n");
        else
            System.out.println("\nOrder is ok\n");

        System.out.println("Total cost: "+ (boltPrice * bolts + nutPrice * nuts + washerPrice * washers));
    }
}