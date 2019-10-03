package room;

import behaviours.IUse;
import player.Monster;
import player.PlayerCharacter;

import java.util.ArrayList;

public class MonsterRoom extends Room implements IUse {

    private ArrayList<IUse> treasure;
    private ArrayList<Monster> monsters;
    PlayerCharacter playerCharacter;

    public MonsterRoom(String name) {
        super(name);
        this.treasure = new ArrayList<IUse>();
        this.monsters = new ArrayList<Monster>();
    }

    public ArrayList<IUse> getTreasure() {
        return treasure;
    }

    public void addTreasure(IUse item) {
        treasure.add(item);
    }

    public void addMonster(Monster monster){
        monsters.add(monster);
    }

    public void getSkills() {

    }

    public int monstersCount(){
        return monsters.size();
    }

    public int treasureCount(){
        return treasure.size();
    }

    public void progress(Room room){
        if(monstersCount() == 0){
            playerCharacter.open(room);
        }
    }

    public void monsterKilled(Monster monster){
        if(monster.getHp() <= 0 ){
            monsters.remove(monster);
        }
    }

}
