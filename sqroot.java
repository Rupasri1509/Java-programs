import java.util.Scanner;

public class sqroot {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number from the user
        double number = scanner.nextDouble();
        
        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate the square root using the Newton-Raphson method
        double squareRoot = calculateSquareRoot(number);

        // Display the result
        System.out.println("Square root of " + number + " is approximately: " + squareRoot);
    }

    // Function to calculate the square root using the Newton-Raphson method
    private static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }

        // Initial guess for the square root
        double guess = number / 2.0;

        // Iteratively improve the guess using the Newton-Raphson formula
        for (int i = 0; i < 10; i++) {
            guess = 0.5 * (guess + number / guess);
        }

        return guess;
    }
}
