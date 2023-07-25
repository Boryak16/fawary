import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(account account) {
        accounts.add(account);
    }

    public void depositToAccount(int accountNumber, double amount) {
        account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawFromAccount(int accountNumber, double money) {
        account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(money);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayBalance(int accountNumber) {
        account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccount_number());
            System.out.println("Account Holder: " + account.getAccount_name());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private account findAccount(int accountNumber) {
        for (account account : accounts) {
            if (account.getAccount_number() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}




