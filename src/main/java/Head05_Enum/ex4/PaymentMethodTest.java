package Head05_Enum.ex4;

public class PaymentMethodTest {
    public static void main(String[] args) {
        for (PaymentMethod method : PaymentMethod.values()){
            System.out.println(method.name() + " => " + method.getDisplayName());
        }
    }
}
