package Day16;
import java.util.*;
class Student{
    int id;
    String name;
    int mark;
    Student(int id,String name,int mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student>s=new ArrayList<>();
        s.add(new Student(6,"X",20));
        s.add(new Student(4,"p",40));
        s.add(new Student(1,"q",95));
        s.add(new Student(9,"r",55));
        s.add(new Student(5,"s",99));
        Comparator<Student> byId=new Comparator<Student>() {
            public int compare(Student a,Student b){
                return a.id-b.id;
            }
        };

        Collections.sort(s,byId);
        System.out.print(s);
        Comparator<Student> bymark=new Comparator<Student>() {
            public int compare(Student x,Student y){
                return x.mark-y.mark;
            }
        };
        Collections.sort(s,bymark);
        System.out.print(s);
    }
}
