import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");
    public GrassPokemon(String name, int level, int hp, String attack, String sound) {
        super(name, level, hp, attack, sound);
        setType("grass");
    }
    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }
    public void leafStorm(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> LEAF STORM <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> SOLAR BEAM <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> LEACH SEED <<\n");
        name.setHp(getHp() + 10);
        enemy.setHp(getHp() - 10);
        System.out.println(enemy.getName() + " leaches 10 hp to " + name.getName());// leechSeed trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug
        attack(name, enemy);
        result(name, enemy);
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        introduction(name, enemy);
        System.out.println("\n>> LEAVE BLADE <<\n");
        attack(name, enemy);
        result(name, enemy);
    }

    void attack(Pokemon name, Pokemon enemy){
        switch (enemy.getType()) {
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.getName() + " loses 40 hp");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.getName() + " loses 30 hp");
            }
            case "water" -> {
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
