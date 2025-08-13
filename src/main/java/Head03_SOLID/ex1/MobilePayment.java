package Head03_SOLID.ex1;

public class MobilePayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("모바일 결제: " + amount + "원");
    }
}
