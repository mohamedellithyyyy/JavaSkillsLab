public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        if (divisibleBy4) {
            if (divisibleBy100) {
                return divisibleBy400;
            } else {
                return true;
            }
        }

        return false;
    }

}
