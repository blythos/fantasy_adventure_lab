package playerTests;

import player.Monk;
import player.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonkTest {

    Monk monk;
    Monster monster;

    @Before
    public void setUp(){
        monk = new Monk("Beau", 100, 100, 15, 14, 15, 13,11, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, monk.getHp());
    }

    @Test
    public void canAttack(){
        monk.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(monk);
        assertEquals(80, monk.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", monk.talk());
    }
}
