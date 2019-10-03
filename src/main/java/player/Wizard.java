package player;

import behaviours.IAttack;
import behaviours.IWizardSkill;
import skills.FireBolt;

public class Wizard extends PlayerCharacter implements IAttack {

    IWizardSkill skill;

    public Wizard(String name, int hp, int mp, int str, int dex, int con, int will, int wis, int cha) {
        super(name, hp, mp, str, dex, con, will, wis, cha);
        this.skill = new FireBolt("FireBolt");
    }

    public void attack(Monster monster) {
        if(this.getWill() > monster.getCon()){
            monster.takeDamage(this.skill.getDamage());
        }
    }

    public void useSkill(Monster monster){
        int base = fireBolt.useSkill();
        int mpcost = fireBolt.getMpCost();
        if (this.getMp() >= mpcost){

        }

    }
}
