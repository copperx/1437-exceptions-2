class InvalidStepCountException extends RuntimeException {
    public InvalidStepCountException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static double stepsToMiles(int steps)
            throws InvalidStepCountException {

        if (steps < 0) {
            throw new InvalidStepCountException(
                "Step count cannot be negative."
            );
        }

        return steps / 2000.0;
    }

    public static void main(String[] args) {
       
            double miles = stepsToMiles(-1);
            System.out.println("Miles: " + miles);
        
    }
}
