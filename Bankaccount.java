class BankAccount {
    String depositorName;
    String accountType;
    int accountNumber;
    double balance;

    void assignValues(String name, String type, int number, double initialBalance) {
        depositorName = name;
        accountType = type;
        accountNumber = number;
        balance = initialBalance;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void display() {
        System.out.println("Depositor: " + depositorName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.assignValues("Shubh", "Savings", 12345, 5000);

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.display();
    }
}
