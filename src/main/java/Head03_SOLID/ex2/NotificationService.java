package Head03_SOLID.ex2;
//상위 모듈
public class NotificationService {
    private final NotificationSender sender; //추상화에만 의존

    //고수준 service가 직접 객체를 만들어서 생성을 하는 것이 아니라!
    //고수준은 인터페이스만 안다! 어떤 구현을 쓸지는 외부가 주입을 한다?
    //생ㅅㅇ자 주입
    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }
    //메소드 notify
    public void notify(String message){
        sender.send(message);
    }
}
