package Day10;

class Locker{
    private int lockerId;
    private boolean isLocked;
    private int pinCode;
    private String storedItem;

    Locker(int lockerId, int pinCode){
        this.lockerId = lockerId;
        this.pinCode = pinCode;
        isLocked = true;
    }
    
    public void storeItem(String item, int pin){
        if(pin == pinCode){
            if(!isLocked){
                storedItem = item;
                System.out.println("Stored successfully");
            }
            else{
                System.out.println("Locker is locked");
            }
        }
        else{
            System.out.println("Entered pin is wrong");
        }
    }

    public void retrieveItem(int pin){
        if(pin == pinCode){
            if(!isLocked && storedItem != null){
                System.out.println("Retrieved item: "+storedItem);
                storedItem = null;
            }
            else if(storedItem == null){
                System.out.println("Locker is Empty");
            }
            else{
                System.out.println("Locker is locked");
            }
        }
        else{
            System.out.println("Pin is wrong");
        }
    }

    public void unlock(int pin){
        if(pin == pinCode){
            isLocked = false;
            System.out.println("Locker unlocked");
        }
        else{
            System.out.println("Wrong pin");
        }
    }

    public void lock(){
        isLocked = true;
        System.out.println("Locker locked");
    }

}

public class Task {
    public static void main(String[] args){
        Locker l1 = new Locker(1, 12345);
        l1.unlock(12345);
        l1.storeItem("Bag", 12345);
        l1.retrieveItem(12345);
        l1.lock();
    }
}
