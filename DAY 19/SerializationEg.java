import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Student implements Serializable{   //no method or variable is present , class can be serialized
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream objStream) throws IOException{
        super(objStream);
    }
    @Override
    protected void writeStreamHeader(){  // to prevent creation of header

    }
}

public class SerializationEg {
    public static void main(String[] args) throws IOException{
        Student s=new Student("ABC4",67);
        File file=new File("student.txt");
        FileOutputStream fo=new FileOutputStream("student.txt",true);//open file
        // true is used to create separate object (deserialization cannot happen)
        //ObjectOutputStream objStream=new ObjectObjectStream//obj to bytestream
        ObjectOutputStream objStream;
        if(file.length()==0){
            objStream=new ObjectOutputStream(fo); //first time serializing
        }else{
            objStream=new CustomObjectOutputStream(fo); //appending to the existing serialization file
        }
        objStream.writeObject(s);//writing on files
        fo.close();
        objStream.close();

    }
}
