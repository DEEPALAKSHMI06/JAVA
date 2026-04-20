@FunctionalInterface  // should contain only one method
interface Math{
    int add(int a,int b);
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}

public class LambdaEg {
    public static void main(String[] args) {
        /*Math addfunc=new Math(){
            @Override
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println(addfunc.add(21,80));*/
        //Math obj=(a,b)->a+b;   // lambda funtion or anonymous function
       // System.out.println(obj.add(11,44));
        Math obj=(a,b)->{      // for  multiple statements use {} it should always have return statement
            System.out.println("Adding two numbers...");
            return a+b;
        };
        System.out.println(obj.add(1,567));
        Exercise ex=()->System.out.println("HELLO WORLD");
        ex.sayHello();

    }
}
