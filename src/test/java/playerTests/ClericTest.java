package playerTests;

import player.Cleric;
import player.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Monster monster;

    @Before
    public void setUp(){
        cleric = new Cleric("Rhona Rivenstone", 100, 100, 15, 14, 15, 13,18, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void canAttack(){
        cleric.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(cleric);
        assertEquals(80, cleric.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", cleric.talk());
    }
}
