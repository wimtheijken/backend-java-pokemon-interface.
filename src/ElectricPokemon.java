import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ElectricPokemon extends Pokemon {

    private List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");
    public ElectricPokemon(String name, int level, int hp, String attack, String sound) {
        super(name, level, hp, attack, sound);
        setType("electric");
    }
    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }
    void thunderPunch(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> THUNDER PUNCH <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void electroBall(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> ELECTRO BALL <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void thunder(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> THUNDER <<\n");
        if (Objects.equals(enemy.getType(), "electric")) {
            enemy.setHp(enemy.getHp() + 20);// thunder levert een hp boost aan electric Pokemons
            System.out.println(enemy.getName() + " gets a boost of 20 hp");
        }
        attack(name, enemy);
        result(name, enemy);
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> VOLT TACKLE <<\n");
        attack(name, enemy);
        result(name, enemy);
    }
    void attack(Pokemon name, Pokemon enemy){
        switch (enemy.getType()) {
            case "water" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 hp");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 hp");
            }
            case "fire" -> {
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
