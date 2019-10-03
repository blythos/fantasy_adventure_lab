package playerTests;

import player.Barbarian;
import player.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Monster monster;

    @Before
    public void setUp(){
        barbarian = new Barbarian("Grog Strongjaw", 100, 100, 15, 14, 15, 13,11, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, barbarian.getHp());
    }

    @Test
    public void canAttack(){
        barbarian.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(barbarian);
        assertEquals(80, barbarian.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", barbarian.talk());
    }
}
