) public class MarathonDistance {
    public static void main(String[] args) {

        // a) Declare variables
        int miles;
        int yards;
        double kilometers;

        // b) Initialize miles and yards for a marathon
        miles = 26;
        yards = 385;

        // c & d) Calculate kilometers and store the result
        kilometers = (miles + (yards / 1760.0)) * 1.609;

        // Optional: print the result
        System.out.println("Marathon distance in kilometers: " + kilometers);
    }
}

