package Head05_Enum.ex2;

public class PlanetTest {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()){
            System.out.println( planet.toString());
            System.out.println(planet.surfaceGravity());
        }
    }
}
