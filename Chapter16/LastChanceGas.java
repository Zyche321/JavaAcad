import java.util.Scanner;
public class LastChanceGas {
    public static void main(String[] args) {

        Scanner ducay = new Scanner (System.in);

        System.out.println("Tank Capacity: ");
        int tankCapacity = ducay.nextInt();
        System.out.println("Gage reading: ");
        int gageReading = ducay.nextInt();
        System.out.println("Miles per gallon: ");
        int milesGallon = ducay.nextInt();

        int maximumDistance = (int)(gageReading / 100.0 * tankCapacity) * milesGallon;

        if (maximumDistance >= 200)
            System.out.println("Safe to proceed");
        else
            System.out.println("Get Gas!");
    }
}
