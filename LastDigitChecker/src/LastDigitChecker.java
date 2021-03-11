public class LastDigitChecker {
    public static boolean hasSameLastDigit(int paramOne, int paramTwo, int paramThree) {
        while ( (paramOne >= 10 && paramOne <= 1000) && (paramTwo >= 10 && paramTwo <= 1000) && (paramThree >= 10 &&
                paramThree <= 1000) ) {

            int lastDigitParamOne = paramOne % 10;
            int lastDigitParamTwo = paramTwo % 10;
            int lastDigitParamThree = paramThree % 10;

            if ( (lastDigitParamOne == lastDigitParamTwo) || (lastDigitParamOne == lastDigitParamThree) ||
                    ((lastDigitParamTwo == lastDigitParamThree)) ) {
                return true;
            }
            else return false;
        }
        return false;
    }

    public static boolean isValid(int paramOne) {
        while (paramOne >= 10 && paramOne <= 1000) {
            return true;
        }
        return false;
    }
}
