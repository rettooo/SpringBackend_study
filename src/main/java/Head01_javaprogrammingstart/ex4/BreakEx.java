package Head01_javaprogrammingstart.ex4;

public class BreakEx {
    public static void main(String[] args) {
        double temp = 36.5;
        while(temp < 50){
            System.out.println("temp:" + temp);
            if (temp > 40) {
                System.out.println("temperature is greater than 40");
                break;
            }
            temp++;


        }
    }
}
