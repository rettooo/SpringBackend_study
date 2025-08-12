package Head02_OOPprogramming.topic04_Encapsulation.practice;

public class PaymentServiceTest {
    public static void main(String[] args) {
        //useraccount 객체 생성
        UserAccount user = new UserAccount("UI12");
        PaymentService payment = new PaymentService();


        //정상 입금 테스트
        user.deposit(10000);
        System.out.println("현재 잔액은 " + user.getBalance());

        //1. 음수 입금 테스트
        try{
            user.deposit(-90);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //2. 정상 결제
        payment.processPayment(user, 3000);
        payment.processRefund(user, 3000);


    }
}
