class OutofStockException extends Exception{
    public OutofStockException(String msg){
        super(msg);
    }
}
class PaymentFailException extends Exception{
    public PaymentFailException(String msg){
        super(msg);
    }
}
class OrderFailException extends Exception{
    public OrderFailException(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int stock;
    int price;
    Product(String name,int stock,int price){
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product,User user,int quantity){
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService{
    void placeOrder(Order order) throws OutofStockException,PaymentFailException,OrderFailException{
        if(order.product.stock==0 || order.product.stock<order.quantity){
            throw new OutofStockException("Product out of stock");

        }if(Math.random()<0.4){
            throw new PaymentFailException("Payment failed");
        }if(Math.random()<0.2){
            throw new OrderFailException("Order processing failed");
        }
        order.product.stock-=order.quantity;
        //System.out.println("Order placed successfully");
        

    }
}

public class e_commerce {
    public static void main(String[] args) {
        Product p=new Product("mouse",2,200);
        User u=new User("test1","abd");
        Order o=new Order(p,u,9);
        OrderService s=new OrderService();
        try{
            s.placeOrder(o);
        }
        catch (OutofStockException e){
            System.out.println(e.getMessage());
        }
        catch (PaymentFailException e1){
            System.out.println(e1.getMessage());
        }
        catch (OrderFailException e2){
            System.out.println(e2.getMessage());
        }
    }
}

