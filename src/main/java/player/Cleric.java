package player;

import behaviours.IAttack;

public class Cleric extends PlayerCharacter implements IAttack {

    public Cleric(String name, int hp, int mp, int str, int dex, int con, int will, int wis, int cha) {
        super(name, hp, mp, str, dex, con, will, wis, cha);
    }

    public void attack(Monster monster) {
        if(this.getWis() > monster.getCon()){
            monster.takeDamage();
        }
    }
}
