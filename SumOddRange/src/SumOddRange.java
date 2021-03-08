public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        } else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum+=i;
                }
            }
            return sum;
        } else return -1;
    }
}
