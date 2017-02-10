package TP7.Player;

import TP7.Entity.Groups.Army;
import TP7.Entity.Groups.Battalion;
import TP7.Entity.Groups.Group;
import TP7.Entity.Personnages.Human;
import TP7.Entity.Personnages.Personnage;
import TP7.Entity.Personnages.Troll;
import TP7.Factories.GroupFactory;
import TP7.Factories.PersonnageFactory;
import org.junit.Test;

import static TP7.Factories.Types.GroupType.BATTALION;
import static TP7.Factories.Types.PersonnageType.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:48
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PlayerTest
{
    private Player player = new Player("Player1", 5000);
    
    @Test
    public void getName () throws Exception
    {
        assertEquals("Player1", player.getName());
    }
    
    @Test
    public void Player () throws Exception
    {
        Player player2 = new Player(player);
        
        assertEquals(player, player2);
    }
    
    @Test
    public void getMoneyCount () throws Exception
    {
        assertEquals(5000, player.getMoneyCount(), 0.001);
    }
    
    @Test
    public void pay () throws Exception
    {
        player.pay(50);
    
        assertEquals(4950, player.getMoneyCount(), 0.001);
        
        player.pay(45);
    
        assertEquals(4905, player.getMoneyCount(), 0.001);
    }
    
    @Test
    public void addEntities () throws Exception
    {
        Personnage p1 = PersonnageFactory.createPersonnage(HUMAN, "human1", "bleu", player);
        Personnage p2 = PersonnageFactory.createPersonnage(TROLL, "troll1", "1664", player);
        Personnage p3 = PersonnageFactory.createPersonnage(HUMAN, "human2", "gris", player);
        Army g1 = GroupFactory.createArmy("army1", TAUREN, "Pawndo", 10.4f, player);
        Group g2 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
    
        g1.addBattalion((Battalion) g2);
    
        player.addEntities(p1, p2, p3, g1);
    
        assertEquals(4, player.getEntities().size());
    }
    
    @Test
    public void getEntities () throws Exception
    {
        player.addEntities(new Human("human1", "bleu"));
        player.addEntities(new Troll("troll1", "1664"));
        player.addEntities(new Human("human2", "gris"));
    
        assertEquals(3, player.getEntities().size());
    }
    
    @Test
    public void equals () throws Exception
    {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player1", 400);
        Player p3 = new Player(p1);
    
        assertTrue(p1.equals(p2));
        assertTrue(p1.equals(p3));
    }
    
}