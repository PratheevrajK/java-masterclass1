package section12.d_generics_advanced;

import java.util.Random;

public class Student {
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastnameIndex = random.nextInt(65, 91);
        this.name = firstNames[random.nextInt(4)] + " " + (char) lastnameIndex;
        this.course = courses[random.nextInt(3)];
        this.yearStarted = random.nextInt(2020,2025);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }
}