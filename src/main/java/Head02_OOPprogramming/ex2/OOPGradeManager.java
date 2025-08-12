package Head02_OOPprogramming.ex2;

import org.w3c.dom.ls.LSOutput;

class Order{
    String customer;
    String product; //product 안의 특성을 클래스로 치환할 수 있음!
    int quantity;
    int price;

    Order(String customer, String product, int quantity, int price) {
        this.customer = customer;//클래스를 객체로 생성할 수 있는 생성자
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    int getPrice(){
        return quantity * price; //총 가격 메서드
    }

    void printOrderSummary(){ //출력하는 메서드
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다. \n", customer, product, quantity, getPrice());
    }

}

public class OOPGradeManager {
    public static void main(String[] args) {
        //order 클래스 선언, new 생성자 (클래스의 객체를 생성 )
        Order order = new Order("Alice", "Book", 2, 15000);

        order.printOrderSummary();
    }
}
