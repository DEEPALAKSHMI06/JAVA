class LockerSystem{
    private int LockerId;
    private boolean isLocked;
    private int pinCode;
    private String storeditem;
    LockerSystem(int LockerId,int pinCode){
        this.LockerId=LockerId;
        this.pinCode=pinCode;
        isLocked=true;
    }
    public void storeitem(String item,int pin){
        if(pin==pinCode){
            if(!isLocked){
                storeditem=item;
                System.out.println(item + "Stored successfully");
            }
            else{
                System.out.println("Locker is locked");
            }
        }else{
            System.out.println("Entered pin is wrong");
        }

    }
    public void retrivedata(int pin){
        if(pin==pinCode){
            if(!isLocked && storeditem!=null){
                System.out.println("Retrieved item:"+storeditem);
                storeditem=null;
            }else if(storeditem==null){
                System.out.println("Locker is empty");
            }else{
                System.out.println("Locker is locked");
            }

        }else{
            System.out.println("Pin is wrong");
        }

    }
    public void unlock(int pin){
        if(pin==pinCode){
            isLocked=!isLocked;
            System.out.println("Unlocked successfully");
        }else{
            System.out.println("Pin is wrong");
        }
    }
    public void lock(){
        isLocked=true;
        System.out.println("Locker locked");
    }

}
public class Encapsulation_2 {
    public static void main(String[] args) {
        LockerSystem l=new LockerSystem(1,1234);
        l.unlock(1234);
        l.storeitem("Bag",1234);
        l.retrivedata(1234);
        l.lock();


    }
}
