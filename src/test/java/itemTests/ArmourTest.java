package itemTests;

import armour.Armour;
import armour.ArmourType;
import org.junit.Before;
import org.junit.Test;
import skills.Skill;

import static org.junit.Assert.assertEquals;

public class ArmourTest {

    Armour lightArmour;
    Skill skill;

    @Before
    public void before(){
        lightArmour = new Armour("Mithril Vest", 20, 10, skill, ArmourType.LIGHTARMOUR);
    }

    @Test
    public void canGetName(){
        assertEquals("Mithril Vest", lightArmour.getName());
    }

    @Test
    public void canGetDef(){
        assertEquals(20, lightArmour.getDef());
    }

    @Test
    public void canGetMdef(){
        assertEquals(10, lightArmour.getMdef());
    }
}
