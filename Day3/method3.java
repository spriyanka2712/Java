package Day3;
class Student{
    int marks;
}
public class method3 {
    static void change(Student s){
        s.marks = 20;
        System.out.println("Inside method: "+s.marks);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.marks = 80;
        change(s1);
        System.out.println("Outside Methos: "+s1.marks);
    }
}
