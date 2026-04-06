public class Wrapper_1 {
    public static Integer test1(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        Integer a=Integer.valueOf("12345");  //string to int  return type->object(Integer)
        Integer b=Integer.valueOf(456);   
        Integer c=Integer.parseInt("0987"); // return type->int(int)
        int d=b.intValue(); // unboxing
        System.out.println(b);
        System.out.println(test1("34987"));
        System.out.println(c);
        System.out.println(d);
        Integer x=Integer.valueOf(200);
        Integer y=Integer.valueOf(200);
        System.out.println(x==y);            // range -128 to 127 does not create new object
        System.out.println(x.equals(y));
    
    }
}
