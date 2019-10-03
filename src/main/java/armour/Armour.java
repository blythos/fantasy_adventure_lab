package armour;

import behaviours.IUse;
import skills.Skill;

public class Armour implements IUse {

    private String name;
    private int def;
    private int mdef;
    private Skill skill;
    private ArmourType armour;

    public Armour(String name, int def, int mdef, Skill skill, ArmourType armour){
        this.name = name;
        this.def = def;
        this.mdef = mdef;
        this.skill = skill;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public int getDef() {
        return def;
    }

    public int getMdef() {
        return mdef;
    }

    public Skill getSkill() {
        return skill;
    }
}
