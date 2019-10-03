package items;

import behaviours.IUse;
import skills.Skill;

public class Item implements IUse {

    private String name;
    private Skill skill;
    private ItemType type;

    public Item(String name, Skill skill, ItemType type){
        this.name = name;
        this.skill = skill;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Skill getSkill() {
        return skill;
    }

    public ItemType getType() {
        return type;
    }
}
