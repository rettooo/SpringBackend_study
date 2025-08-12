package Head02_OOPprogramming.topic03_Polymorphism.ex1;

public class PolymorphismTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();
//        service.processPayment(new CreditCardPayment(), 1000);
//        service.processPayment(new AccountTransferPayment(), 2000);

        double[] paymentAmounts = new double[]{
                30000,
                70000,
                10000
        };

        Payment[] payments = new Payment[]{
                new CreditCardPayment(),
                new AccountTransferPayment(),
        };

        for (Payment p : payments){
            if (p instanceof CreditCardPayment){
                service.processPayment(p, paymentAmounts[0]);

            }else if (p instanceof AccountTransferPayment){
                service.processPayment(p, paymentAmounts[1]);
            }
        }

    }
}
