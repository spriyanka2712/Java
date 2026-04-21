package Day21;
@FunctionalInterface
interface Math{
    int add(int a, int b);
}

@FunctionalInterface
interface Exercise{
    void sayHello();
}

public class LambdaExample {
    public static void main(String[] args){
        Math obj = (a, b)->{
            System.out.println("Adding two numbers");
            return a+b;
        };
        Exercise ex = ()->System.out.println("Hello world");
        ex.sayHello();
        // Math obj = new Math(){
        //     @Override
        //     public int add(int a, int b){
        //         return a+b;
        //     }
        // };
        System.out.println(obj.add(11, 22));
    }
}
