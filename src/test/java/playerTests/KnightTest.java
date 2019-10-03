package playerTests;

import Player.Knight;
import Player.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    Monster monster;

    @Before
    public void setUp(){
        knight = new Knight("Percy", 100, 100, 15, 14, 15, 13,11, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, knight.getHp());
    }

    @Test
    public void canAttack(){
        knight.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(knight);
        assertEquals(80, knight.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", knight.talk());
    }
}
