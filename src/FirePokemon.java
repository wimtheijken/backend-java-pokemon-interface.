import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private List<String> attacks = Arrays.asList("inferno" ,"pyroball", "firelash", "flamethrower");
    public FirePokemon(String name, int level, int hp, String attack, String sound) {
        super(name, level, hp, attack, sound);
        setType("fire");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> FIRE FLASH <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void flameThrower(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> FLAME THROWER <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void pyroBall(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> PYRO BALL <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void inferno(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> INFERNO <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void attack(Pokemon name, Pokemon enemy){
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 hp");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 hp");
            }
            case "electric" -> {
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
