package section7.a_bank_account_challenge;

public class Main {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount();
        firstAccount.setAccountNumber("32255611245");
        firstAccount.setAccountBalance(500.75);
        firstAccount.setUserName("Raj");
        firstAccount.setEmail("raj@yahoo.com");
        firstAccount.setPhoneNumber("+91-9876543210");
        firstAccount.depositFund(100);
        firstAccount.withdrawFund(300.75);
        firstAccount.withdrawFund(500);
    }
}
