class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running using Thread class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){  //3. RUNNING STATE
        try {
            System.out.println("Thread running using runnable");
            Thread.sleep(4000); // 4. BLOCKED/WAITING STATE
            System.out.println("After 4 seconds");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadEg {
    public static void main(String[] args) {
        SampleThread t=new SampleThread();
        t.start();
        // for runnable object is created for both subclass and parent class
        SampleThread2 s=new SampleThread2();
        Thread t2=new Thread(s); //1. NEW STATE
        t2.start();// 2. RUNNABLE STATE
    }
    
}
