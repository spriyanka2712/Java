package Day18;
import java.io.*;
public class Write {
    public static void main(String[] args){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWriter");
            writer.newLine();
            writer.write("Write using FileWriter2");
            writer.newLine();
            writer.write("Write using FileWriter3");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
