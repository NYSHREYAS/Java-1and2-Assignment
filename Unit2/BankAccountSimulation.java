class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n₹" + amount + " deposited successfully");
            displayBalance();


        } else {
            System.out.println("\nInvalid deposit amount");
        }
    }


    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\n₹" + amount + " withdrawn successfully");
            displayBalance();

        }

        else if (amount > balance) {
            System.out.println("\nInsufficient balance! Current balance: ₹" + balance);
        }

        else {
            System.out.println("\nInvalid withdrawal amount");
        }
    }


    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        displayBalance();
    }
}



public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("SBI001", "Shreyas", 5000);
        BankAccount account2 = new BankAccount("SBI002", "Vallabh", 7000);

        account1.displayAccountDetails();
        account1.deposit(2000);
        account1.withdraw(3000);
        account1.withdraw(5000);

        account2.displayAccountDetails();
        account2.deposit(3000);
        account2.withdraw(1000);
        account2.withdraw(-500);
    }
}
