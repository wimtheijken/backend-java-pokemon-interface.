public abstract class Pokemon {
    private String name;
    private int level;
    private int hp; //(health points)
    private String food;
    private String sound;
    private String type;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void introduction(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " with " + name.getHp() + " hp will fight with\n" + enemy.getName() + " with " + enemy.getHp() + " hp");
    }

    public void result(Pokemon name, Pokemon enemy){
        System.out.println(enemy.getName() + " has left " + enemy.getHp() + " hp\n" + name.getName() + " has left " + name.getHp() + " hp\n");

    }
}
