package Head02_OOPprogramming.topic03_Polymorphism.ex1;

public class OrderService {
    public void processPayment(Payment paymentMethod, double amount){
        paymentMethod.pay(amount);
    }

}

