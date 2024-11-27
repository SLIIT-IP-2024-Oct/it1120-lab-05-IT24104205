import java.util.Scanner;

public class IT24104205Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int numMembers = scanner.nextInt();

        // Validate the input
        if (numMembers < 0) {
            System.out.println("Invalid input. Number of new members must be 0 or greater.");
        } else {
            // Determine the prize using a SWITCH statement
            String prize;
            switch (numMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Display the prize
            System.out.println("The customer is entitled to: " + prize);
        }

        scanner.close();
    }
}
