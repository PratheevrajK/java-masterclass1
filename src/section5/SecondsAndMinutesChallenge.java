package section5;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(0, 45));
        System.out.println(getDurationString(0, 0));
    }
    public static String getDurationString(int seconds) {
        if (seconds<0) {
            return "Invalid seconds value!";
        }
        return getDurationString(seconds/60, seconds%60);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (seconds<0 || seconds>60) {
            return "Invalid seconds value!";
        }
        if (minutes<0) {
            return "Invalid minutes value!";
        }
        return (minutes/60) + "h " + (minutes%60) + "m " +  (seconds) + "s";
    }
}
