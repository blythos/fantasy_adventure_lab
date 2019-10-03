package playerTests;

import Player.Archer;
import Player.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArcherTest {

    Archer archer;
    Monster monster;

    @Before
    public void setUp(){
        archer = new Archer("Vex'alia", 100, 100, 15, 14, 15, 13,11, 16);
        monster = new Monster("Beholder", 200, 16, 12);
    }

    @Test
    public void getHP(){
        assertEquals(100, archer.getHp());
    }

    @Test
    public void canAttack(){
        archer.attack(monster);
        assertEquals(180, monster.getHp());
    }

    @Test
    public void canTakeDamage(){
        monster.attack(archer);
        assertEquals(80, archer.getHp());
    }

    @Test
    public void canTalk(){
        assertEquals("DND WOO!", archer.talk());
    }
}
