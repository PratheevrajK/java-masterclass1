package section7.d_inheritance_challenge;

public class HourlyEmployee extends Employee{
    private double hourlyPay;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPay) {
        super(name, birthDate, hireDate);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public double collectPay() {
        return hourlyPay * 40;
    }

    public double doublePay() {
        return collectPay() * 2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPay=" + hourlyPay +
                "} " + super.toString();
    }
}
