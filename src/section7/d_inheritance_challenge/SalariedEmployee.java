package section7.d_inheritance_challenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    private static String CURRENT_DATE = "01/01/2025";

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public void retire() {
        terminate(CURRENT_DATE);
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26;
        return isRetired ? payCheck * 0.9 : payCheck;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
