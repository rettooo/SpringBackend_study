package Head01_javaprogrammingstart.ex1;

public class operator {
    //산술 연산자
    public static void main(String[] args) {
        //변수
//        int a = 10, b= 3;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a/b); //  소수는 x
//        System.out.println((double)(a/b));
//        System.out.println(a%b);

        //boolean
//        boolean a = true, b = false;
//        System.out.println(a&b);
//        System.out.println(a || b);
//        System.out.println(!a);
//        System.out.println(a^b);

        //대입 연산
//        int num = 10;
//        num += 5;
//        num *= 2;
//        System.out.println(num);

        //if 문을 삼항 연산자로 쉽게 가능

        int score = 85;

//        if (score> 90){
//            result = "A";
//        }else {
//            result = "B";
//        }
//        System.out.println(result);

        //조건식 ? 참일때 값: 거짓일때 값
        String result = (score > 90) ? "A" : "B";
        System.out.println(result);
    }

}
