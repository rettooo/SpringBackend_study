package Head01_javaprogrammingstart.practice;

public class ConditionEx {
    //num이 홀수, 짝수 구분하고, num이 어떤 숫자인지 출력하기
    public static void main(String[] args) {
        int num = 4;

        if (num %2 ==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

        switch(num) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            default:
                System.out.println("other");
        }

    }
}
