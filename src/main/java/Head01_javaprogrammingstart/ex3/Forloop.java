package Head01_javaprogrammingstart.ex3;

public class Forloop {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 1 ; i < 11; i++){
            sum += i;
        }

        System.out.println(sum );

        for (int i = 0 ; i <=3; i ++){
            //System.out.println("i: " + i );
            for (int j = 0;  j <=6 ; j++){
                System.out.println("    j: " + j );
            }
            System.out.println("i: " + i );
            System.out.println();
        }

    }
}
