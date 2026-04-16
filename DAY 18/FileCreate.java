
import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException{
        // can use try and catch method
        File newFile=new File("test.txt");
        if(newFile.createNewFile()){
            System.out.println("File Created: "+newFile.getName());
        }else{
            System.out.println("Not able to create file");
        }
    }
}
