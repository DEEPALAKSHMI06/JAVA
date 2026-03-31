class BankAccount{
    private double balance;
    public void setBalance(double balance){  // setter to access private variable
        if(balance>0){
            this.balance=balance;
        }else{
            System.out.println("Input not valid");
        }
    }
    public void withdraw(int amt){
        if(amt>0 && amt<=balance){
            balance-=amt;
            System.out.println("Amount debited:"+amt);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void deposit(int amt){
        if(amt>0){
            balance+=amt;
            System.out.println("Amount credited:"+amt);
        }else{
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){  //getter to return  private variable
        return balance;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(500);
        System.out.println(b.getBalance());
        b.deposit(3000);
        System.out.println(b.getBalance());



    }
}
