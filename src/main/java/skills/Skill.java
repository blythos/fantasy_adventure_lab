package skills;

public abstract class Skill {

    private String name;
    private int mpCost;
    private int damage;

    public Skill(String name){
        this.name = name;
        this.mpCost = 0;
        this.damage = 0;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
