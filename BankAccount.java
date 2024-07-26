public class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Successfully deposited: $" + amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public boolean withdraw(double amount){
        if(amount> 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully wihdrew: $"+ amount);
            return true;

        }else{
            System.out.println("Invalid or insufficient funds for withdrawl.");
            return false;
        }
    }
}