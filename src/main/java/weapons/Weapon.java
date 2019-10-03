package weapons;

import behaviours.IUse;
import skills.Skill;

public class Weapon implements IUse {

    private String name;
    private int atk;
    private int matk;
    private Skill skill;
    private WeaponType type;

    public Weapon(String name, int atk, int matk, Skill skill, WeaponType type){
        this.name = name;
        this.atk = atk;
        this.matk = matk;
        this.skill = skill;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }

    public int getMatk() {
        return matk;
    }

    public Skill getSkill() {
        return skill;
    }

    public WeaponType getType() {
        return type;
    }
}
