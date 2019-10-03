package room;

import behaviours.IUse;

import java.util.ArrayList;

public class TreasureRoom extends Room implements IUse{

    private ArrayList<IUse> treasure;

    public TreasureRoom(String name) {
        super(name);
        this.treasure = new ArrayList<IUse>();
    }

    public ArrayList<IUse> getTreasure() {
        return treasure;
    }

    public void addTreasure(IUse item) {
        treasure.add(item);
    }

    public int treasureCount(){
        return treasure.size();
    }

    public void getSkills() {

    }
}
