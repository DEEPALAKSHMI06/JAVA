
import java.util.List;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }public int getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return name+" "+salary;
    }
}

public class StreamsEg {
    public static void main(String[] args) {
        //map function
        List<Integer> numbs=List.of(2,3,4,5,6);
        List<Integer> multiplyBy2=numbs.stream().map((i)->i*2).toList();
        // stream()-source , map()-intermediate operation , toList()-Terminal operation
        System.out.println(multiplyBy2);
        //filter function
        List<Integer> even=numbs.stream().filter((i)->(i%2==0)).toList();
        System.out.println(even);
        //reduce function
        int total=even.stream().reduce(0,(a,b)->a+b);
        System.out.println(total);
        //object creation and map 
        List<Employee> employees=List.of(new Employee("Employee1", 2000),new Employee("Employee2", 40000));
        List<String> EmployeeNames=employees.stream().map((i)->i.getName()).toList();
        System.out.println(EmployeeNames);
        //filter
        List<Employee> EmployeeSalary=employees.stream().filter((i)->i.getSalary()>3000).toList();
        System.out.println(EmployeeSalary.toString());
    }
}
