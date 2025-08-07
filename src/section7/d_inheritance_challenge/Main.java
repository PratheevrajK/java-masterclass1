package section7.d_inheritance_challenge;

public class Main {
    public static void main(String[] args) {

        Employee raj = new Employee("Raj", "01/01/1990", "01/01/2015");
        System.out.println(raj);
        System.out.println(raj.getAge());
        System.out.println(raj.collectPay());

        SalariedEmployee pratheev = new SalariedEmployee("Pratheev", "10/10/2000", "10/10/2020", 1000000, false);
        System.out.println(pratheev);
        System.out.println("Pratheev's Pay Cheque is $" + pratheev.collectPay());
        pratheev.retire();
        System.out.println("Pratheev's Pension cheque is $" + pratheev.collectPay());
        System.out.println(pratheev);

        HourlyEmployee mary = new HourlyEmployee("Mary", "10/10/1950", "10/10/1975", 20);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.doublePay());
    }
}
