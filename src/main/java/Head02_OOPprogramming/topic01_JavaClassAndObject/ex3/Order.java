package Head02_OOPprogramming.topic01_JavaClassAndObject.ex3;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //field
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    //생성자 메서드 (생성을 하는 메소드 )
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    //메서드
    //오버 로딩
    public Order(String orderId, List<Product> products){
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }
    public Order(String orderId){
        this(orderId, new ArrayList<>());
    }
    //getter 생성 법 실습

}
