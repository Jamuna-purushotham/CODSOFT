import java.util.Scanner;

public class ATM{
    private BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
    }
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose an option");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount =scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again");
                    break;
            }
        }

        scanner.close();
        System.out.println("ATM session ended.");

    }

    public void checkBalance(){
        System.out.println("Current balance: $" + account.getBalance());
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
    public void withdraw(double amount){
        account.withdraw(amount);
    }
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount(500.00);
        ATM atm = new ATM(userAccount);
        atm.displayMenu();
    }
}