package Head02_OOPprogramming.ex3;

public class ConstructorEx {
    public static void main(String[] args) {
        //자료형 변수 지정
        // 선언, 초기화
        int num  =1 ;
        // 객체
        String str1 = "문자열1";

        //Order 클래스 => 객체 생성 -> 생성자 메소드를 써야함.
        //타입이 Order class인 order1 이라는 이름의 변수 선언
        //new Order() (Order 클래스 생성자) 를 통해 초기화
        Order order1 = new Order(str1);
        Product product1 = new Product("d", "d", 123);

    }
}
