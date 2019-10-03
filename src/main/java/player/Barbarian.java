package player;

import behaviours.IAttack;

public class Barbarian extends PlayerCharacter implements IAttack {

    private String skill;

    public Barbarian(String name, int hp, int mp, int str, int dex, int con, int will, int wis, int cha) {
        super(name, hp, mp, str, dex, con, will, wis, cha);
        this.skill = skill;
    }

    public void attack(Monster monster) {
        if(this.getStr() > monster.getCon()){
            monster.takeDamage();
        }
    }
}
