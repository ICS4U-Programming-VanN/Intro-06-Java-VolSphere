/**
 * Calculate and display the volume a the sphere with the given radius.
 *
 * @author Van
 * @version 1.0
 * @since 2024/02/19
 */
import java.util.Scanner;

public class VolSphere {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the radius of the sphere
    System.out.print("Enter the radius of the sphere: ");

    // Check if the input is a decimal number
    if (scanner.hasNextDouble()) {
      // Read the radius from the user
      double radius = scanner.nextDouble();

      // Check if the radius is non-negative
      if (radius >= 0) {
        // Calculate the volume of the sphere using the formula V = (4/3) * π * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Round the volume to 3 decimal places
        volume = Math.round(volume * 1000.0) / 1000.0;

        // Display the result with units
        System.out.println(
            "The volume of the sphere with radius "
                + radius
                + " units is: "
                + volume
                + "units^3");
      } else {
        // If the radius is negative, inform the user and end the program
        System.out.println("Please enter a non-negative radius. Program terminated.");
      }
    } else {
      // If the input is not a decimal number, inform the user
      System.out.println("Invalid input. Please enter a decimal number. Program terminated.");
    }

    // Close the Scanner to prevent resource leaks
    scanner.close();
  }
}
