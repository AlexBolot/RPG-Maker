package TP7.Entity.Groups;

import TP7.Entity.Personnages.Human;
import TP7.Factories.GroupFactory;
import TP7.Player.Player;
import org.junit.Test;

import static TP7.Factories.Types.GroupType.BATTALION;
import static TP7.Factories.Types.PersonnageType.ORC;
import static TP7.Factories.Types.PersonnageType.TAUREN;
import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The ArmyTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:34
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class ArmyTest
{
    private Army army = new Army("army", new Human("general1", "bleu"));
    
    @Test
    public void getGeneral () throws Exception
    {
        assertEquals(new Human("general1", "bleu"), army.getGeneral());
    }
    
    @Test
    public void getBattalions () throws Exception
    {
        Player player = new Player("player1", 5000);
        
        TP7.Entity.Groups.Group g1 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.Entity.Groups.Group g2 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.Entity.Groups.Group g3 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        
        army.addBattalion((Battalion) g1, (Battalion) g2, (Battalion) g3);
        
        assertEquals(3, army.getBattalions().size());
    }
    
    @Test
    public void addBattalion () throws Exception
    {
        Player player = new Player("player1", 5000);
        
        TP7.Entity.Groups.Group g1 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.Entity.Groups.Group g2 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.Entity.Groups.Group g3 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        
        army.addBattalion((Battalion) g1, (Battalion) g2, (Battalion) g3);
        
        assertEquals(3, army.getBattalions().size());
    }
    
    
    @Test
    public void getPower () throws Exception
    {
        Player player = new Player("player1", 5000);
        
        Battalion b1 = (Battalion) GroupFactory.creatGroup(BATTALION, "group1", ORC, 5, 10.4f, player);
        Battalion b2 = (Battalion) GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        Battalion b3 = (Battalion) GroupFactory.creatGroup(BATTALION, "group1", ORC, 5, 10.4f, player);
        
        army.addBattalion(b1, b2, b3);
        
        assertEquals(437.5f, army.getPower(), 0.001f);
    }
    
    @Test
    public void getProtection () throws Exception
    {
        
    }
    
    @Test
    public void ToString () throws Exception
    {
        
    }
    
}