import org.junit.Before;
import org.junit.Test;
import skills.Skill;
import weapons.Weapon;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon sword;
    Skill skill;

    @Before
    public void before(){
        skill = new Skill();
        sword = new Weapon("Sword of Punching", 30, 12, skill, WeaponType.SWORD);
    }

    @Test
    public void getName(){
        assertEquals("Sword of Punching", sword.getName());
    }

    @Test
    public void getatk(){
        assertEquals(30, sword.getAtk());
    }
}
