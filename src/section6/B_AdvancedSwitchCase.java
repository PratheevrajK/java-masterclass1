package section6;

/*
NOTES:
yield Keyword was introduced in Java13 to return the result from a switch expression.
*/

public class B_AdvancedSwitchCase {
    public static void main(String[] args) {
        String month = "Apr";
        System.out.println(month + " is " + traditionalSwitch(month) + " quarter.");
        System.out.println(month + " is " + advancedSwitch(month) + " quarter.");
        month = "asdf";
        System.out.println(month + " is " + traditionalSwitch(month) + " quarter.");
        System.out.println(month + " is " + advancedSwitch(month) + " quarter.");
    }
    public static String traditionalSwitch(String month) {
        switch (month) {
            case "Jan": case "Feb": case "Mar":
                return "1st";
            case "Apr": case "May": case "Jun":
                return "2nd";
            case "Jul": case "Aug": case "Sep":
                return "3rd";
            case "Oct": case "Nov": case "Dec":
                return "4th";
        }
        return "Bad";
    }
    public static String advancedSwitch(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
//            default -> "Bad";
            default -> {
                yield "not a valid month. So, could not determine the";
            }
        };
    }
}
