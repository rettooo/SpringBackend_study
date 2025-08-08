package Head01_javaprogrammingstart.ex3;

public class SwitchEx {
    public static void main(String[] args) {
        int day = 22 ;
        switch (day %7){
            case 1:
                System.out.println("금");
                break;
            case 2:
                System.out.println("토");
                break;
            case 3:
                System.out.println("일");
                break;
            default:
                System.out.println("기타요일");
                break;
        }
    }
}
