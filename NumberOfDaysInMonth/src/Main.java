public class Main {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
    }

    public static boolean isLeapYear(int year) {
        if ( (year < 1) || (year > 9999 ) ) {
            return false;
        } else {
            return ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) );
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ( (month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            switch(month) {
                case 1:
                    return Janu
            }
        }
}
