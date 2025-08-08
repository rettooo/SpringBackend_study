package Head01_javaprogrammingstart.practice;

public class BreakExample {
    public static void main(String[] args) {
        //1~5까지 가다가 3이되면 건너뛰고, 4가되면 멈춰라.
        for (int i = 1; i <=5; i++){
            if (i==3) continue;
            if (i==5) break;
            System.out.println(i);
        }
    }
}
