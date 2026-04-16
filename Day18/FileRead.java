package Day18;
import java.io.*;
public class FileRead {
    public static void main(String[] args){
        try{
            BufferedReader fr = new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line=fr.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
