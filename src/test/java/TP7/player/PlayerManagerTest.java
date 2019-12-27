package TP7.player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerManagerTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PlayerManagerTest {
    private PlayerManager playerManager = new PlayerManager();

    @Test
    public void getPlayer() {
        Player p1 = new Player("Player1", 500);
        playerManager.addPlayer(p1);

        assertEquals(p1, playerManager.getPlayer(p1.getName()));
    }

    @Test
    public void addPlayer1() {
        playerManager.addPlayer("Player1", 500);

        assertEquals(new Player("Player1", 500), playerManager.getPlayer("Player1"));
    }

    @Test
    public void addPlayer2() {
        Player p1 = new Player("Player1", 500);
        playerManager.addPlayer(p1);

        assertEquals(p1, playerManager.getPlayer(p1.getName()));
    }

    @Test
    public void deletePlayer1() {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player2", 500);
        playerManager.addPlayer(p1);
        playerManager.addPlayer(p2);

        playerManager.deletePlayer(p2);

        assertEquals(p1, playerManager.getPlayer(p1.getName()));
        assertNotEquals(p2, playerManager.getPlayer(p2.getName()));
    }

    @Test
    public void deletePlayer2() {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player2", 500);
        playerManager.addPlayer(p1);
        playerManager.addPlayer(p2);

        playerManager.deletePlayer(p2.getName());

        assertEquals(p1, playerManager.getPlayer(p1.getName()));
        assertNotEquals(p2, playerManager.getPlayer(p2.getName()));
    }

}