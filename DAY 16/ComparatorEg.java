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
        return id+"-"+name+"-"+mark;
    }
}
public class ComparatorEg {
    public static void main(String[] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student(4,"q",90));
        s.add(new Student(1,"y",43));
        s.add(new Student(3,"g",87));
        s.add(new Student(5,"k",56));
        s.add(new Student(9,"u",98));
        Comparator<Student> byId=new Comparator <Student>(){
            public int compare(Student a,Student b){
                return a.id-b.id;

            }
        };
        Collections.sort(s,byId);
        System.out.println(s);
        //Comparator<Student> byMark=new Comparator<Student>() { 
            //public int compare(Student a,Student b){
                //return a.mark-b.mark;
            //}
        //};
        Collections.sort(s,(a,b)->a.mark-b.mark);  // it is the short form of the above method
        // it is called lambda function
        System.out.println(s);




    }

}
