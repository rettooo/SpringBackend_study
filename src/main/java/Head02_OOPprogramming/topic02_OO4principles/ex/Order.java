package Head02_OOPprogramming.topic02_OO4principles.ex;

public class Order {
    private String orderId;
    private Delivery delivery; //has a 관계

    public Order(String orderId, String trackingNumber, String carrier) {
        this.orderId = orderId;
        this.delivery = new Delivery(trackingNumber, carrier); //

    }
    public void startOrderDelivery(){
        if (delivery != null){
            delivery.startDelivery();
        }else{
            System.out.println("배송 정보가 없습니다.");
        }
    }



}
