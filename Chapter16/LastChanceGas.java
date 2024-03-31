import java.util.Scanner;
public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Tank Capacity: ");
        int tankCapacity = scan.nextInt();
        System.out.println("Gage reading: ");
        int gageReading = scan.nextInt();
        System.out.println("Miles per gallon: ");
        int milesGallon = scan.nextInt();

        int maximumDistance = (int)(gageReading / 100.0 * tankCapacity) * milesGallon;
        if (maximumDistance >= 200)
            System.out.println("Safe to proceed");
        else
            System.out.println("Get Gas!");
    }
}
