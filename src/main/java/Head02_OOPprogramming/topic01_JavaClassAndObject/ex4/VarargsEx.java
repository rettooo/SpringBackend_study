package Head02_OOPprogramming.topic01_JavaClassAndObject.ex4;
//가변인자 이슈
public class VarargsEx {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.print(1,2);
    }
}

class Example {
//    void print(int a, int b ){
//        System.out.println("fixed two ints");
//    }

    //가변인자의 요소 메서드볻 일반 메서드가 우선이다.
    void print(int ... nums){
        System.out.println("varargs ints");
    }
}