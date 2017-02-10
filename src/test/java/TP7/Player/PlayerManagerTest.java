package TP7.Player;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerManagerTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PlayerManagerTest
{
    private PlayerManager playerManager = new PlayerManager();
    
    @Test
    public void getPlayer () throws Exception
    {
        Player p1 = new Player("Player1", 500);
        playerManager.addPlayer(p1);
        
        assertEquals(p1, playerManager.getPlayer(p1.getName()));
    }
    
    @Test
    public void addPlayer1 () throws Exception
    {
        playerManager.addPlayer("Player1", 500);
        
        assertEquals(new Player("Player1", 500), playerManager.getPlayer("Player1"));
    }
    
    @Test
    public void addPlayer2 () throws Exception
    {
        Player p1 = new Player("Player1", 500);
        playerManager.addPlayer(p1);
        
        assertEquals(p1, playerManager.getPlayer(p1.getName()));
    }
    
    @Test
    public void deletePlayer1 () throws Exception
    {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player2", 500);
        playerManager.addPlayer(p1);
        playerManager.addPlayer(p2);
        
        playerManager.deletePlayer(p2);
        
        assertEquals(p1, playerManager.getPlayer(p1.getName()));
        assertNotEquals(p2, playerManager.getPlayer(p2.getName()));
    }
    
    @Test
    public void deletePlayer2 () throws Exception
    {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player2", 500);
        playerManager.addPlayer(p1);
        playerManager.addPlayer(p2);
        
        playerManager.deletePlayer(p2.getName());
        
        assertEquals(p1, playerManager.getPlayer(p1.getName()));
        assertNotEquals(p2, playerManager.getPlayer(p2.getName()));
    }
    
}