package Head03_SOLID.ex1;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("신용카드 결제: "  + amount + "원 ");
    }

}
