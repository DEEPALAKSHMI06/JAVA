public class CompileTimeExcept {
    public static void main(String[] args){
        Thread T=new Thread(() ->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(6000);
                System.out.println("thread wake");
            }catch(InterruptedException e){
                System.out.println("Sleep Interrupted");
            }
        });
        T.start();
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("Not T");
        }
        T.interrupt(); // it will interrupt the thread with high sleep time so 6000 is interrupted and the output is sleep interrupted
// if the time is 2000 and 4000 the output is thread wake.
    }
    

}
