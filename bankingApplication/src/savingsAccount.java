public class savingsAccount extends account {
    private double interest;
    private int year;
    public savingsAccount(int accountNumber, String accountName, double balance, double interest) {
        super(accountNumber, balance,accountName);
        this.interest=interest;
        this.year=year;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest()  //interest of yearly
    {
     interest= getBalance()*1/10;
     return interest;
    }

}
