package Day10;

class BankAccount{
    public double balance;
    public void setBalance(double balance){
        if(balance > 0){
            this.balance = balance;
        }
        else{
            System.out.println("Input not valid");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount debited: "+amount);
        }
        else{
            System.out.println("Entered Invalid amount");
        }
    }
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount credited: "+amount);
        }
        else{
            System.out.println("Entered Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.withdraw(500);
        System.out.println(b.getBalance());
        b.deposit(9000);
        System.out.println(b.getBalance());
    }
}
