class BankAccountx
{
    double balance;
    BankAccountx(double balance)
    {
        this.balance = balance;
    }
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends BankAccountx {
    SavingsAccount(double balance) {
        super(balance);
    }
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Minimum balance of 100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class LAB6Q4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.deposit(200);
        sa.withdraw(550);
        sa.withdraw(50);
    }
}
