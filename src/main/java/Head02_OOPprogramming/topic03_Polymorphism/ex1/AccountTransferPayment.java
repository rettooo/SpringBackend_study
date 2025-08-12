package Head02_OOPprogramming.topic03_Polymorphism.ex1;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("계좌 이체: " +amount + "원 결제 처리.  ");
    }
}
