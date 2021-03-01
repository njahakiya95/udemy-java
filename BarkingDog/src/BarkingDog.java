public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return True;
        }
        else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return False;
        }
        else {
            return False;
        }
    }
}
