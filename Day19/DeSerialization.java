package Day19;
import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws Exception{
        FileInputStream fi=new FileInputStream("student.txt");
        ObjectInputStream ObjStream=new ObjectInputStream(fi);
        while (true) { 
            try {
                Student s=(Student)ObjStream.readObject();
                System.out.println(s.name+" "+s.mark);
            } catch (EOFException e) {
                break;
            }
        }
        fi.close();
        ObjStream.close();  
    }
}
