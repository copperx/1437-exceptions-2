import java.util.Scanner;

public class StepPractice {
    public static double stepsToMiles(int steps) {
        // TODO: Throw IllegalArgumentException if steps is negative.
        if(steps < 0) {
            throw new IllegalArgumentException("Steps is negative");
        }

        return steps / 2000.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your step count: ");
        String text = input.nextLine();

        // TODO: Handle invalid numeric text and negative step counts.
        // Handle NumberFormatException, then IllegalArgumentException
        try {
            int steps = Integer.parseInt(text);
            double miles = stepsToMiles(steps);

            System.out.println("Miles: " + miles);
        } catch(NumberFormatException e) {
            System.out.println("You must enter a number");
        } catch(IllegalArgumentException e) {
            System.out.println("Steps must be positive");
        }
        
    }
}
