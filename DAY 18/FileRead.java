import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
    public static void main(String[] args){
        //FileReader can read only character by character.
        /*try{
           FileReader fr=new FileReader("test.txt");
           int character;
            while((character=fr.read())!=-1){
                System.out.print((char)character);
            }
        }catch(IOException e){
            System.out.println(e);
        }*/

        //BufferedReader can read entire line
        try {
            BufferedReader fr=new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line=fr.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }    
    }

}
