public class Exercise06_09 {

    // Convert feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    // Convert meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {

        // Table header
        System.out.printf("%-10s%-15s%-15s%-10s%n", 
                          "Feet", "Meters", "Meters", "Feet");
        System.out.println("------------------------------------------------------");

        double meterValue = 20.0;

        // Row loop
        for (int i = 1; i <= 10; i++) {
            double meters = footToMeter(i);
            double feet = meterToFoot(meterValue);

            System.out.printf("%-10.1f%-15.3f%-15.1f%-10.3f%n",
                    (double)i, meters, meterValue, feet);

            meterValue += 5;
        }
    }
}