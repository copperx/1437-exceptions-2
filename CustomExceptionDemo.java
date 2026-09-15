class InvalidStepCountException extends Exception 
{

}

public class CustomExceptionDemo {
    public static double stepsToMiles(int steps) throws InvalidStepCountException {

        if (steps < 0) {
            throw new InvalidStepCountException();
        }

        return steps / 2000.0;
    }

    public static void main(String[] args) {
       try {
            double miles = stepsToMiles(-1);
            System.out.println("Miles: " + miles);
       } catch(InvalidStepCountException e) {
            System.out.println("Error: Steps was negative");
       }
    }
}
