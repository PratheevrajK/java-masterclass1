package section7.b_constructor_challenge;

public class Main {

    public static void main(String[] args) {
        Customer raju = new Customer("Raju", 1000, "raju@yahoo");
        System.out.println(raju.describeCustomer());

        Customer pugazh = new Customer();
        System.out.println(pugazh.describeCustomer());

        Customer kureshi = new Customer("kureshi", "kureshi@yahoo");
        System.out.println(kureshi.describeCustomer());
    }
}
