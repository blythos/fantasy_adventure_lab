package roomTests;

import org.junit.Before;
import org.junit.Test;
import room.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;

    @Before
    public void setUp(){
        treasureRoom = new TreasureRoom("Library");
    }

    @Test
    public void getName(){
        assertEquals("Library", treasureRoom.getName());
    }

    @Test
    public void checkForTreasure(){
        assertEquals(0, treasureRoom.treasureCount());
    }
}
