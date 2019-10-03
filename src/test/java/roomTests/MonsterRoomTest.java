package roomTests;

import org.junit.Before;
import org.junit.Test;
import player.Monster;
import room.MonsterRoom;

import static org.junit.Assert.assertEquals;

public class MonsterRoomTest {

    MonsterRoom monsterRoom;
    Monster monster1;
    Monster monster2;

    @Before
    public void setUp(){
        monsterRoom = new MonsterRoom("Dungeon");
        monster1 = new Monster("Giant", 150, 15, 14);
        monster2 = new Monster("Ogre", 0, 12, 14);
    }

    @Test
    public void getName(){
        assertEquals("Dungeon", monsterRoom.getName());
    }

    @Test
    public void checkForTreasure(){
        assertEquals(0, monsterRoom.treasureCount());
    }

    @Test
    public void canKillMonsters(){
        monsterRoom.addMonster(monster1);
        monsterRoom.addMonster(monster2);
        monsterRoom.monsterKilled(monster2);
        assertEquals(1, monsterRoom.monstersCount());
    }
}
