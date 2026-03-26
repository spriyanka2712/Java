package Day5;
class User{
    String name;
    String phone;
    String address;
    String role = "User";

    User(){
        System.out.println("By using super");
    }
    User(String name){
        this.name = name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
    }
}
class Driver extends User{
    String role = "Driver";
    String vehicle;

    Driver(String name, String vehicle){
        super(name);
        this.vehicle = vehicle;
        System.out.println("Name: " +name);
        System.out.println("Role: " +role);
    }

    void displaydriver(){
        super.display();
        System.out.println("Vehicle: "+vehicle);
        System.out.println("Driver class role: "+role);
        System.out.println("User class role: "+super.role);
    }
}

public class app {
    public static void main(String[] args){
        Driver d = new Driver("ABC", "bike");
        d.displaydriver();
    }
}
