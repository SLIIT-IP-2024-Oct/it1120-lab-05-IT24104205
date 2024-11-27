import java.util.Scanner;

public class IT24104205Lab5Q3 {
    // Define constants
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_3_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the start date
        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();

        // Input the end date
        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        // Validation 1: Ensure start and end dates are within valid range (1-31)
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        // Validation 2: Ensure start date is less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Calculate discount rate
        double discountRate = 0.0;
        if (numberOfDays == 3 || numberOfDays == 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate total cost
        double totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
        double discountedCost = totalCost - (totalCost * discountRate / 100);

        // Display the results
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.printf("Total amount to be paid: Rs %.2f\n", discountedCost);

        scanner.close();
    }
}
