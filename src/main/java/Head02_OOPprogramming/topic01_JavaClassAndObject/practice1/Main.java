package Head02_OOPprogramming.topic01_JavaClassAndObject.practice1;

public class Main {
        public static void main(String[] args) {
            CoffeeMachine cm = new CoffeeMachine(
                    500,
                    new String[] {"Espresso", "Arabica"},
                    true
            );
            cm.powerOn();
            cm.powerOff();
        }
}
