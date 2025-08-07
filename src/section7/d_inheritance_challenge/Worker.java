package section7.d_inheritance_challenge;

public class Worker {
    private static int CURRENT_YEAR = 2025;
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge() {
        int birthYear = Integer.parseInt(birthDate.substring(birthDate.length()-4));
        return CURRENT_YEAR-birthYear;
    }
    public double collectPay() {
        return 0.0;
    }
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
