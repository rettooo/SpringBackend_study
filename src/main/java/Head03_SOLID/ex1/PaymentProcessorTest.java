package Head03_SOLID.ex1;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcesser = new PaymentProcessor();

        Payment[] payments = new Payment[]{
                new AccountTransferPayment(),
                new CreditCardPayment(),
                new MobilePayment()
        };
        double[] paymentsAmounts = new double[]{
                5000,1000,20000
        };
        int index = 0;
        for (Payment payment: payments){
            paymentProcesser.pay(payment, paymentsAmounts[index++]);
        }
    }

}
