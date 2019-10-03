package Player;

public class Monster {
    private String name;
    private int hp;
    private int str;
    private int con;
    PlayerCharacter playerCharacter;

    public Monster(String name, int hp, int str, int con){
        this.name = name;
        this.hp = hp;
        this.con = con;
        this.str = str;
    }

    public int getCon() {
        return con;
    }

    public int getHp() {
        return hp;
    }

    public void attack(PlayerCharacter playerCharacter) {
        if(this.str > playerCharacter.getCon()){
            playerCharacter.takeDamage();
        }
    }

    public void takeDamage() {
        this.hp -= 20; //TODO: change to weapon damage
    }
}
