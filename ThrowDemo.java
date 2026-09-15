// URL of this file: https://tinyurl.com/5xtmwe7a
public class ThrowDemo {
    public static int slicesPerPerson(int slices, int people) {
        System.out.println("Inside slicesPerPerson");
        if(slices < 0) {
            throw new IllegalArgumentException("Slices should not be negative: " + slices);
        }
        if(people <= 0) {
            throw new IllegalArgumentException("Number of people must be positive: " + people);
        }
        return slices / people;
    }

    public static void showShare(int slices, int people) {
        System.out.println("Starting calculation");
        int share = slicesPerPerson(slices, people);
        System.out.println("Slices per person: " + share);
        System.out.println("Calculation finished");
    }

    public static void main(String[] args) {
        try {
            showShare(12, 3);
            System.out.println("Returned normally to main");
        } catch(IllegalArgumentException e) {
            System.out.println("Cannot calculate: " + e.getMessage());
        }
        System.out.println("Program continues");
    }
}