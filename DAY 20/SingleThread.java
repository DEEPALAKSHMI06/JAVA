public class SingleThread {
    public static void main(String[] args) {
        //single threaded
        task1();
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // disadvantage */
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("From task 1 "+ i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("From task 2 "+i);
            
        }
    }
}
