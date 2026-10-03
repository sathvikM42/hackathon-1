import java.util.Scanner;

public class SolarEnergyCalculator {

    // Method to calculate total energy generated
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read morning and evening energy generation values from the user
        System.out.print("Enter energy generated in the morning (kWh): ");
        double morningEnergy = scanner.nextDouble();

        System.out.print("Enter energy generated in the evening (kWh): ");
        double eveningEnergy = scanner.nextDouble();

        // Call the method
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Display the total energy generated
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}