abstract class PaymentMethod{
    abstract void pay(double amt);
}

class UPI extends PaymentMethod {
    private String upiId;
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    void pay(double amt) {
        System.out.println("Paid " + amt + " using UPI: " + upiId);
    }
}

class Card extends PaymentMethod {
    private String cardNumber;
    public Card(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    void pay(double amt) {
        System.out.println("Paid " + amt + " using Card: " + cardNumber);
    }
}

class Transaction {
    private String type;
    private double amt;
    public Transaction(String type, double amt) {
        this.type = type;
        this.amt = amt;
    }
    public void display() {
        System.out.println(type + " : " + amt);
    }
}

class Wallet {
    private double balance;
    private Transaction[] transactions;
    private int count;
    public Wallet() {
        balance = 0;
        transactions = new Transaction[10];
        count = 0;
    }
    public void addMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        if (count < transactions.length) {
            transactions[count] = new Transaction("Credit", amount);
            count++;
        } else {
            System.out.println("Transaction storage full");
        }
    }
    public void makePayment(double amount, PaymentMethod method) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance!");
            }
            method.pay(amount);  
            balance -= amount;
            if (count < transactions.length) {
                transactions[count] = new Transaction("Debit", amount);
                count++;
            } else {
                System.out.println("Transaction storage full");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
    
}
class User {
    private String name;
    private Wallet wallet;
    public User(String name) {
        this.name = name;
        this.wallet = new Wallet();
    }
    public Wallet getWallet() {
        return wallet;
    }
    public void displayUser() {
        System.out.println("User: " + name);
    }
}

public class WalletSystem {
    public static void main(String[] args) {
        User user = new User("ABC");
        user.displayUser();
        Wallet wallet = user.getWallet();
        wallet.addMoney(1000);
        wallet.showBalance();
        PaymentMethod upi = new UPI("abc@upi");
        wallet.makePayment(300, upi);
        PaymentMethod card = new Card("1234");
        wallet.makePayment(800, card);
        wallet.showBalance();
        
    }
}

