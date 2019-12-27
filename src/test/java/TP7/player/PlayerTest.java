package TP7.player;

import TP7.entity.groups.Army;
import TP7.entity.groups.Battalion;
import TP7.entity.groups.Group;
import TP7.entity.personnages.Human;
import TP7.entity.personnages.Personnage;
import TP7.entity.personnages.Troll;
import TP7.factories.GroupFactory;
import TP7.factories.PersonnageFactory;
import org.junit.Test;

import static TP7.factories.types.GroupType.BATTALION;
import static TP7.factories.types.PersonnageType.*;
import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PlayerTest {
    private Player player = new Player("Player1", 5000);
    
    @Test
    public void getName() {
        assertEquals("Player1", player.getName());
    }
    
    @Test
    public void Player() throws Exception {
        Player player2 = (Player) player.clone();

        assertEquals(player, player2);
    }
    
    @Test
    public void getMoneyCount() {
        assertEquals(5000, player.getMoneyCount(), 0.001);
    }
    
    @Test
    public void pay() {
        player.pay(50);
    
        assertEquals(4950, player.getMoneyCount(), 0.001);
        
        player.pay(45);
    
        assertEquals(4905, player.getMoneyCount(), 0.001);
    }
    
    @Test
    public void addEntities() {
        Character p1 = PersonnageFactory.createPersonnage(HUMAN, "human1", "bleu", player);
        Character p2 = PersonnageFactory.createPersonnage(TROLL, "troll1", "1664", player);
        Character p3 = PersonnageFactory.createPersonnage(HUMAN, "human2", "gris", player);
        Army g1 = GroupFactory.createArmy("army1", TAUREN, "Pawndo", 10.4f, player);
        Group g2 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
    
        g1.addBattalion((Battalion) g2);
    
        player.addEntities(p1, p2, p3, g1);
    
        assertEquals(4, player.getEntities().size());
    }
    
    @Test
    public void getEntities() {
        player.addEntities(new Human("human1", "bleu"));
        player.addEntities(new Troll("troll1", "1664"));
        player.addEntities(new Human("human2", "gris"));
    
        assertEquals(3, player.getEntities().size());
    }
    
    @Test
    public void equals() throws Exception {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player1", 400);
        Player p3 = (Player) p1.clone();

        assertEquals(p1, p2);
        assertEquals(p1, p3);
    }
    
}