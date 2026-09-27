import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Create a Scanner to get input from the user.
        // Ask the user to enter their age.
        // Safely check that the input is a valid integer.
        // If the age is 21 or older, display that the user gets a paper wrist band.
        // Otherwise, do nothing.
        // If the input is invalid, display an error message.

        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }

        in.close();
    }
}
