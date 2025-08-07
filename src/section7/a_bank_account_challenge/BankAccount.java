package section7.a_bank_account_challenge;

public class BankAccount {
    public String accountNumber;
    public double accountBalance;
    public String userName;
    public String email;
    public String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double fund) {
        if (fund > 0.0) {
            this.accountBalance += fund;
            System.out.println("Updated account balance after Deposit is: " + this.accountBalance);
        } else {
            System.out.println("Deposit fund amount should be greater than 0.");
        }
    }
    public void withdrawFund(double fund) {
        if (fund > 0.0) {
            if(this.accountBalance - fund > 0.0) {
                this.accountBalance -= fund;
                System.out.println("Updated account balance after Withdrawal is: " + this.accountBalance);
            } else {
                System.out.println("You do not have sufficient balance to withdraw! Balance amount = " + this.accountBalance);
            }

        } else {
            System.out.println("Withdrawing fund amount should be greater than 0.");
        }
    }
}
