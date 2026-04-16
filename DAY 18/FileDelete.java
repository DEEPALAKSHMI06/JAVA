
import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) throws IOException {
        File newFile=new File("Test2.txt");
         if(newFile.createNewFile()){
            System.out.println("File Created: "+newFile.getName());
        }else{
            System.out.println("Not able to create file");
        }
        if(newFile.delete()){
            System.out.println("File deleted");
        }else{
            System.out.println("File not found");
        }
    }
}
