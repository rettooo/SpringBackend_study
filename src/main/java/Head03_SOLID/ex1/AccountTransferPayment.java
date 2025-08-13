package Head03_SOLID.ex1;

public class AccountTransferPayment implements  Payment{
    @Override
    public void pay(double amount){
        System.out.println("계좌이체 결제: " + amount + "원");
    }
}
