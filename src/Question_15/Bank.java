package Question_15;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    private HashMap<String, BankAccount> accounts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        if (!accounts.containsKey(accountNumber)) {
            BankAccount account = new BankAccount(accountNumber, accountHolder, initialDeposit);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account holder: " + account.getAccountHolder());
            System.out.println("Current balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> checkBalance();
                case 5 -> System.out.println("Thank you for using the banking system.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
