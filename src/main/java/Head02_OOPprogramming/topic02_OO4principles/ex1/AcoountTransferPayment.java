package Head02_OOPprogramming.topic02_OO4principles.ex1;

public class AcoountTransferPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("계좌 이체로 " + amount + "원 결제 완료. ");
    }
}
