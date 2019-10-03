package itemTests;

import items.Item;
import items.ItemType;
import org.junit.Before;
import org.junit.Test;
import skills.Skill;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item herb;
    Skill skill;

    @Before
    public void before(){
        skill = new Skill();
        herb = new Item("Herb", skill, ItemType.HEALING);
    }

    @Test
    public void canGetName(){
        assertEquals("Herb", herb.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(ItemType.HEALING, herb.getType());
    }

    
}
