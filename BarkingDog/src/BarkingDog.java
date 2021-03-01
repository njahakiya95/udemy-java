public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 8 || hourOfDay > 22) {
            return True;
        }
        else if (hourOfDay < 0 || hourOfDay > 23) {
            return False;
        }
        else {
            return False;
        }
    }
}
