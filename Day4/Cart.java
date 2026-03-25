package Day4;
class Product{
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalPrice(){
        return price * quantity;
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("---------------------");
    }
}
public class Cart {
    public static void main(String[] args){
        Product p1 = new Product(1, "Laptop", 50000.00, 1);
        Product p2 = new Product(2, "mouse", 200.0, 3);
        Product p3 = new Product(3, "keyboard", 1500.0, 2);
        Product cart[] = {p1, p2, p3};
        double grandTotal = 0.0;
        for(Product p : cart){
            p.display();
            grandTotal += p.getTotalPrice();
        }
        System.out.println("Grand Total Price: "+grandTotal);
}
}
