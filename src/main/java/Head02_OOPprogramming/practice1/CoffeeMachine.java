package Head02_OOPprogramming.practice1;
import java.util.Arrays;

public class CoffeeMachine {
    //1. 필드 상태
    private int waterAmount;
    private String[] beanType;
    private boolean isOn;

    //2. 생성자
    public CoffeeMachine(int waterAmount, String[] beanType, boolean power_on) {
        this.waterAmount = waterAmount;
        this.beanType = beanType;
        this.isOn = power_on;
    }
    public void powerOn(){
        isOn= true;
        System.out.println("전원을 켭니다.");
    }
    //3. toString 을 통해 객체 안에 어떤 요소 ?
    public void powerOff(){
        isOn = false;
        System.out.println("전원을 끕니다.");
    }

    //4. 원두 선택

}

