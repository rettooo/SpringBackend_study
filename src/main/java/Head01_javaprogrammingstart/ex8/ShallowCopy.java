package Head01_javaprogrammingstart.ex8;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] original = {1,2,3};
        int[] copy = original;
        copy[0] = 100;
        //System.out.println(original[0]);

        int num1 = 10;
        int num2 = 10;
        System.out.println( num1 ==num2);

        //참조형 객체는 다른 주소가 담김?
        String str1 = new String("문자열"); //새 객체
        String str2 = "문자열";


        //System.out.println("str1 == str2" + str1 == str2);
        //System.out.println("Str1 ==Str2 " + str1.equals(str2));
    }
}
