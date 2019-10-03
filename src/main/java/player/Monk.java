package player;

import behaviours.IAttack;

public class Monk extends PlayerCharacter implements IAttack {

    public Monk(String name, int hp, int mp, int str, int dex, int con, int will, int wis, int cha) {
        super(name, hp, mp, str, dex, con, will, wis, cha);
    }

    public void attack(Monster monster) {
        if(this.getStr() > monster.getCon()){
            monster.takeDamage();
        }
    }
}
