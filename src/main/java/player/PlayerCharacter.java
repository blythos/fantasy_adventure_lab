package player;

//import java.util.ArrayList;

import armour.Armour;
import behaviours.IUse;
import room.Room;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class PlayerCharacter {

    private String name;
    private int hp;
    private int mp;
    private int Str;
    private int Dex;
    private int Con;
    private int Will;
    private int Wis;
    private int Cha;
    private ArrayList<IUse> inventory;
    Weapon weapon;
    Armour armour;

    public PlayerCharacter(String name, int hp, int mp, int str, int dex, int con, int will, int wis, int cha){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.Str = str;
        this.Dex = dex;
        this.Con = con;
        this.Will = will;
        this.Wis = wis;
        this.Cha = cha;
        this.inventory = new ArrayList<IUse>();
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getStr() {
        return Str;
    }

    public int getDex() {
        return Dex;
    }

    public int getCon() {
        return Con;
    }

    public int getWill() {
        return Will;
    }

    public int getWis() {
        return Wis;
    }

    public int getCha() {
        return Cha;
    }

    public String talk(){
        return "DND WOO!";
    }

    public void takeDamage() {
        this.hp -= 20; //TODO: change to weapon damage
    }

    public void open(Room room){

    }

    public ArrayList<IUse> seeInventory(){
        return inventory;
    }
}
