package Head01_javaprogrammingstart.ex5;

public class ArrrayAccess {
    public static void main(String[] args) {
        int[] numbers = {3,7,8};
        System.out.println(numbers[2]);
        //배열 수정
        numbers[2] = 5;
        System.out.println(numbers[2]);
        //유효하지 않은 인덱스 접근 시 예외 발생
        // System.out.println(numbers[5]);
    }
}
