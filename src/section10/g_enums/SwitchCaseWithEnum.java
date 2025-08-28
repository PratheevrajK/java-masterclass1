package section10.g_enums;

import java.util.Random;

public class SwitchCaseWithEnum {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            printDayOfWeek(Basics.getRandomDay());
        }
//        Monday is day 2
//        Wednesday is day 4
//        Thursday is day 5
//        Saturday is day 7
//        Sunday is day 1
//        Tuesday is day 3
//        Friday is day 6
//        Thursday is day 5
//        Thursday is day 5
//        Saturday is day 7
    }
    public static void printDayOfWeek(DayOfTheWeek dayOfWeek) {
        int day = dayOfWeek.ordinal() + 1;
        switch(dayOfWeek) {
            case WED -> System.out.println("Wednesday is day " + day);
            case SAT -> System.out.println("Saturday is day " + day);
            default -> System.out.println(
                    dayOfWeek.name().charAt(0)
                            + dayOfWeek.name().substring(1).toLowerCase()
                            + "day is day " + day
            );
        }
    }
}
