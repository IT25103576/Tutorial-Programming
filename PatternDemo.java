public class PatternDemo {

    public static void main(String[] args) {

        // -----------------------------
        // Using while loop (Square 5x5)
        // -----------------------------
        System.out.println("Using while loop");

        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        // Space between patterns
        System.out.println();

        // -----------------------------
        // Using for loop (Triangle)
        // -----------------------------
        System.out.println("Using for loop");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
