package playerTests;

import player.Monster;
import player.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Monster monster;

    @Before
    public void setUp(){
        warlock = new Warlock("Fjord", 100, 100, 15, 14, 15, 13,11, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, warlock.getHp());
    }

    @Test
    public void canAttack(){
        warlock.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(warlock);
        assertEquals(80, warlock.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", warlock.talk());
    }
}
