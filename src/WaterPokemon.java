import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WaterPokemon extends Pokemon {
    private List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");
    public WaterPokemon(String name, int level, int hp, String attack, String sound) {
        super(name, level, hp, attack, sound);
        setType("water");
    }
    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }
    /*De volgende 16 methodes zijn aanvallen*/
    void surf(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> SURF <<\n");
        attack(name, enemy);
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> HYDRO PUMP <<\n");
        attack(name, enemy);
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> HYDRO CANON <<\n");
        attack(name, enemy);
    }

    void rainDance(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> RAIN DANCE <<\n");
        if (Objects.equals(enemy.getType(), "electric")) {
            System.out.println("has no effect on " + enemy.getName()); // rainDance heeft geen effect op electric Pokemons maar geeft een system.out.println met de boodschap: "has no effect on (vijand)";
        } else if (Objects.equals(enemy.getType(), "grass")) {
            enemy.setHp(getHp() + 20); // rainDance levert een hp boost aan vijanden grass-types;
            System.out.println(enemy.getName() + " gets a boost of 20 hp");
        } else {
            attack(name, enemy);
        }
    }

    void attack(Pokemon name, Pokemon enemy){
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 hp");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 hp");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.getName() + " loses 20 hp");
            }
            default -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.getName() + " loses 10 hp");
            }
        }
    }

}
