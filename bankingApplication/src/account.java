public class account {
    private int accountNumber;
    private String accountName;
    private double balance;
public account(int accountNumber, double balance, String accountName)
{
    this.accountNumber=accountNumber;
    this.balance=balance;
}
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
        }else
        {
            System.out.println("oops! u can't  enter money =< zero");
        }
    }

    public void withdraw(double money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("insufficient balance");
        }
      }
    public double getBalance()
    {
        return balance;
    }
    public String getAccount_name()
    {
        return accountName;
    }
    public int getAccount_number()
    {
       return accountNumber;
    }
}
