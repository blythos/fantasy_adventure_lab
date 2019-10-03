package playerTests;

import player.Monster;
import player.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Monster monster;

    @Before
    public void setUp(){
        wizard = new Wizard("Caleb Widocast", 100, 100, 15, 14, 15, 13,11, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, wizard.getHp());
    }

    @Test
    public void canAttack(){
        wizard.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(wizard);
        assertEquals(80, wizard.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", wizard.talk());
    }
}
