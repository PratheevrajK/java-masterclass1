package section10.g_enums;

import java.util.Random;

public class Basics {
    public static void main(String[] args) {
        DayOfTheWeek monday = DayOfTheWeek.MON;
        System.out.println("Today is " + monday); //Today is MON
        System.out.printf("Day = %s, Ordinal value =  %d%n", monday.name(), monday.ordinal()); //Day = MON, Ordinal value =  1
        for (int i = 0; i < 10; i++) {
            DayOfTheWeek day = getRandomDay();
            System.out.printf("Day = %s, Ordinal value =  %d%n", day, day.ordinal());
            if(day.equals(DayOfTheWeek.SUN)) {
                System.out.println("Got a weekend!");
            }
        }
//        Day = TUES, Ordinal value =  2
//        Day = WED, Ordinal value =  3
//        Day = WED, Ordinal value =  3
//        Day = THURS, Ordinal value =  4
//        Day = FRI, Ordinal value =  5
//        Day = MON, Ordinal value =  1
//        Day = TUES, Ordinal value =  2
//        Day = MON, Ordinal value =  1
//        Day = SAT, Ordinal value =  6
//        Day = SUN, Ordinal value =  0
//        Got a weekend!

    }
    public static DayOfTheWeek getRandomDay() {
        int randomInt = new Random().nextInt(7); // 0-6
        DayOfTheWeek[] daysOfWeek = DayOfTheWeek.values();
        return daysOfWeek[randomInt];
    }
}
