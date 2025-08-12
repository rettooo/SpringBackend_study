package Head02_OOPprogramming.topic01_JavaClassAndObject.ex1;

public class ProcedureGradeManager {
    public static void main(String[] args) {
        String customer = "Alice";
        String product = "Book";
        int quantity = 2;
        int price = 15000;

        int totalPrice = quantity * price;
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원 입니다. \n", customer, product, quantity, totalPrice);

        //int[] engScores = {};

        //요구사항 : 수학, 영어 점수 평균 구하기
        //요구사항 2 : 과학 성적 추가 or 전체 점수 or 학생 별 데이터 파일 저장
        // -> 요구사항 발생 시 수정과 유지 보수에 용이하지 않음
    }
}
