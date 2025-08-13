package Head05_Enum.ex1;

public class EnumBasicTest {
    public enum Level {
        LOW,Medium,HIGH
    }

    public static void main(String[] args) {
        for(Level lvl: Level.values()){
            System.out.println(lvl + ", ordinal = " + lvl.ordinal()) ;
        }
        Level today = Level.Medium;
        System.out.println("name(): "  + today.name());
    }

}
