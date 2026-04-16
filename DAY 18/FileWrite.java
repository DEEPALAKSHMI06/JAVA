
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            //Buffered writer is faster than File writer.
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWriter1");
            writer.newLine();
            writer.write("Write using FileWriter2");
            writer.newLine();
            writer.write("Write using FileWriter3");
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
