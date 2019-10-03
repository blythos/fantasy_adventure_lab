package skills;

import behaviours.ICan;
import behaviours.IWizardSkill;

public class FireBolt extends Skill implements ICan, IWizardSkill {

    private int mpCost;
    private int damage;

    public FireBolt(String name) {
        super(name);
        this.mpCost = 5;
        this.damage = 10;
    }

    public int getMpCost() {
        return mpCost;
    }

    public int useSkill() {
        return this.damage;
    }


}
