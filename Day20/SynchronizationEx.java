class Bank{
    int balance = 1000;
    void withdraw(int amount){
        if(amount <= balance){
            System.out.println("Amount withdraw successsful");
            balance -= amount;
            System.out.println("Remaining balance: "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}

class BankThread extends Thread{
    Bank bank;
    BankThread(Bank bank){
        this.bank = bank;
    }
    public void run(){
        bank.withdraw(800);
    }
}

public class SynchronizationEx {
    public static void main(String[] args){
        Bank b = new Bank();
        BankThread b1 = new BankThread(b);
        BankThread b2 = new BankThread(b);
        b1.start();
        b2.start();
    }    
}
