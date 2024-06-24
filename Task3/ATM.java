// ATM.java

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }

    private void checkBalance() {
        double balance = account.getBalance();
        System.out.println("Current Balance: $" + balance);
    }

    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Please take your cash.");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000); // Initial balance of $1000
        ATM atm = new ATM(bankAccount);

        while (true) {
            atm.displayMenu();
        }
    }
}
