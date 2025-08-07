package section7.c_records;

public class Main {
    public static void main(String[] args) {
        StudentPojo pojo = new StudentPojo("A1", "Pratheev", "1/1/9999", "Java 8");
        StudentRecord record = new StudentRecord("A2", "Raj", "1/1/9999", "Java 24");

        System.out.println(pojo); // StudentPojo{id='A1', name='Pratheev', dob='1/1/9999', course='Java 8'}
        System.out.println(record); // StudentRecord[id=A2, name=raj, dob=1/1/9999, course=Java 24]

        System.out.println(pojo.getName()); // Pratheev
        System.out.println(record.name()); // Raj

        pojo.setCourse(pojo.getCourse() + ", Java 11");
//        record.setCourse(pojo.getCourse() + ", Java 11"); Setters are not supported in Records as they are immutable.

        System.out.println(pojo.getCourse()); // Java 8, Java 11
        System.out.println(record.course()); // Java 24
    }
}
