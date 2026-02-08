public class Demo1 {

    public static void main(String[] args) {

        // Create object of EvenOddNumber class
        EvenOddNumber obj = new EvenOddNumber();

        int number = 10;  // You can change this value

        // Call method
        boolean result = obj.findEvenOrOdd(number);

        // Display output
        if (result) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
