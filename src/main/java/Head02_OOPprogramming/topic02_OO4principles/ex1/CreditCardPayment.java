package Head02_OOPprogramming.topic02_OO4principles.ex1;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}
