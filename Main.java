import java.util.ArrayList;

public class Bank {
    private double amount;
    private ArrayList<Double> transactions;

    public Bank() {
        this.amount = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double money) {
        if (money > 0) {
            amount += money;
            transactions.add(money);
            System.out.println("Deposited: " + money);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double money) {
        if (money > 0 && money <= amount) {
            amount -= money;
            transactions.add(-money);
            System.out.println("Withdrawn: " + money);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void listInteractions() {
        System.out.println("Transaction History:");
        for (double transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.deposit(100);
        myBank.withdraw(50);
        myBank.deposit(200);
        myBank.withdraw(30);
        myBank.listInteractions();
    }
}
