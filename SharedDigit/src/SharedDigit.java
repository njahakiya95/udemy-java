public class SharedDigit {
    public static boolean hasSharedDigit(int paramOne, int paramTwo) {
        while ((paramOne >= 10 && paramOne <= 99) && (paramTwo >= 10 && paramTwo <= 99)) {
            int firstDigitParamOne = paramOne / 10;
            int lastDigitParamOne = paramOne % 10;
            int firstDigitParamTwo = paramTwo / 10;
            int lastDigitParamTwo = paramTwo % 10;
            if ( (firstDigitParamOne == firstDigitParamTwo) || (firstDigitParamOne == lastDigitParamTwo) ||
                    (lastDigitParamOne == lastDigitParamTwo) || (lastDigitParamOne == firstDigitParamTwo)) {
                return true;
            }
            else return false;
        }
        return false;
    }
}
