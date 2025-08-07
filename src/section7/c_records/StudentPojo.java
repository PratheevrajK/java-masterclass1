package section7.c_records;

public class StudentPojo {
    private String id;
    private String name;
    private String dob;
    private String course;

    public StudentPojo(String id, String name, String dob, String course) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
