class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtstart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtend(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int position,int data){
        if (position==0){
           insertAtstart(data); 
           return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if (temp==null) return;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtstart(){
        if(head==null){
            return ;
        }
        head=head.next;
    }
    public void deleteAtEnd(){
        Node temp=head;
        if(head==null) return;
        if(head.next==null){
            head=null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtPosition(int position){
        if(head==null) return;
        if(position==0) head=head.next;
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp.next==null) return;
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
    }
    public void reverse(int list){
    }
    
    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println("null");
    }
}

public class Linked {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtstart(5);
        list.insertAtend(10);
        list.insertAtstart(1);
        list.insertAtPosition(2,67 );
        list.display();
        list.deleteAtPosition(0);   
        System.out.println("After Deleting");
        list.display();
    }
}
