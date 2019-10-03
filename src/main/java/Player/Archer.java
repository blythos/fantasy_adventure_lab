package Player;

public class Archer extends PlayerCharacter implements IAttack {

    public Archer(String name, int hp, int mp, int str, int dex, int con, int will, int wis, int cha) {
        super(name, hp, mp, str, dex, con, will, wis, cha);
    }

    public void attack(Monster monster) {
        if(this.getDex() > monster.getCon()){
            monster.takeDamage();
        }
    }
}
