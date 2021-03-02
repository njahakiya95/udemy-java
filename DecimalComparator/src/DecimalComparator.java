public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int first_num = (int) (num1 * 1000);
        int second_num = (int) (num2 * 1000);

        return (first_num - second_num == 0);
    }
}
