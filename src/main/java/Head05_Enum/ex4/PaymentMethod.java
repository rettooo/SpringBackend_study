package Head05_Enum.ex4;

public enum PaymentMethod { //상수의 이름 .name()도 출력
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일 결제");

    private final String displayName;

    //생성자: enum 상수마다 초기화
    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


}
