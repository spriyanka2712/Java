package Day7;
class Calculator{
    int add(int num1, int num2){
        return num1+num2;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}

public class Math {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
    }
}
