package TP7.Player;

import TP7.Factories.Types.PersonnageType;
import TP7.Groups.Army;
import TP7.Groups.Battalion;
import TP7.Groups.Horde;
import TP7.Personnages.Human;
import TP7.Personnages.Personnage;
import TP7.Personnages.Troll;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 16:19
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PlayerTest
{
    private Player player = new Player("Player1", 500);
    
    @Test
    public void getName () throws Exception
    {
        assertEquals("Player1", player.getName());
    }
    
    @Test
    public void getMoneyCount () throws Exception
    {
        assertEquals(500, player.getMoneyCount(), 0.001);
    }
    
    @Test
    public void pay () throws Exception
    {
        player.pay(50);
        
        assertEquals(450, player.getMoneyCount(), 0.001);
        
        player.pay(45);
        
        assertEquals(405, player.getMoneyCount(), 0.001);
    }
    
    @Test
    public void getPersonnages () throws Exception
    {
        player.addPersonnage(new Human("human1", "bleu"));
        player.addPersonnage(new Troll("troll1", "1664"));
        player.addPersonnage(new Human("human2", "gris"));
        
        assertEquals(3, player.getPersonnages().size());
    }
    
    @Test
    public void getHordes () throws Exception
    {
        Horde horde1 = new Horde("horde1", PersonnageType.ORC, 5, 7.5f);
        Horde horde2 = new Horde("horde2", PersonnageType.HUMAN, 2, "vert");
        Horde horde3 = new Horde("horde3", PersonnageType.TAUREN, 3, 12.4f);
        
        player.addHorde(horde1);
        
        assertEquals(1, player.getHordes().size());
        
        player.addHorde(horde2);
        player.addHorde(horde3);
        
        assertEquals(3, player.getHordes().size());
    }
    
    @Test
    public void getBattalions () throws Exception
    {
        Battalion battalion1 = new Battalion("battalion1", PersonnageType.ORC, 5, 7.5f);
        Battalion battalion2 = new Battalion("battalion2", PersonnageType.HUMAN, 2, "vert");
        Battalion battalion3 = new Battalion("battalion3", PersonnageType.TAUREN, 3, 12.4f);
        
        player.addBattalion(battalion1);
        
        assertEquals(1, player.getBattalions().size());
        
        player.addBattalion(battalion2);
        player.addBattalion(battalion3);
        
        assertEquals(3, player.getBattalions().size());
    }
    
    @Test
    public void getArmies () throws Exception
    {
        Army army1 = new Army("army1", new Human("human1", "bleu"));
        Army army2 = new Army("army2", new Troll("troll1", "1664"));
        Army army3 = new Army("army3", new Human("human2", "gris"));
        
        player.addArmy(army1);
        
        assertEquals(1, player.getArmies().size());
        
        player.addArmy(army2);
        player.addArmy(army3);
        
        assertEquals(3, player.getArmies().size());
    }
    
    @Test
    public void addPersonnage () throws Exception
    {
        Personnage p1 = new Human("human1", "bleu");
        Personnage p2 = new Troll("troll1", "1664");
        Personnage p3 = new Human("human2", "gris");
        
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(p1);
        personnages.add(p2);
        personnages.add(p3);
        
        player.addPersonnage(personnages);
        
        assertEquals(3, player.getPersonnages().size());
    }
    
    @Test
    public void addPersonnage1 () throws Exception
    {
        player.addPersonnage(new Human("human1", "bleu"));
        player.addPersonnage(new Troll("troll1", "1664"));
        player.addPersonnage(new Human("human2", "gris"));
        
        assertEquals(3, player.getPersonnages().size());
    }
    
    @Test
    public void addHorde () throws Exception
    {
        Horde p1 = new Horde("horde1", PersonnageType.ORC, 5, 7.5f);
        Horde p2 = new Horde("horde2", PersonnageType.TAUREN, 5, 11.7f);
        Horde p3 = new Horde("horde3", PersonnageType.ORC, 5, 7.5f);
        
        ArrayList<Horde> hordes = new ArrayList<>();
        hordes.add(p1);
        hordes.add(p2);
        hordes.add(p3);
        
        player.addHorde(hordes);
        
        assertEquals(3, player.getHordes().size());
    }
    
    @Test
    public void addHorde1 () throws Exception
    {
        player.addHorde(new Horde("horde1", PersonnageType.ORC, 5, 7.5f));
        player.addHorde(new Horde("horde2", PersonnageType.TAUREN, 5, 11.7f));
        player.addHorde(new Horde("horde3", PersonnageType.ORC, 5, 7.5f));
        
        assertEquals(3, player.getHordes().size());
    }
    
    @Test
    public void addBattalion () throws Exception
    {
        Battalion p1 = new Battalion("battalion1", PersonnageType.ORC, 5, 7.5f);
        Battalion p2 = new Battalion("battalion2", PersonnageType.TAUREN, 5, 11.7f);
        Battalion p3 = new Battalion("battalion3", PersonnageType.ORC, 5, 7.5f);
        
        ArrayList<Battalion> battalions = new ArrayList<>();
        battalions.add(p1);
        battalions.add(p2);
        battalions.add(p3);
        
        player.addBattalion(battalions);
        
        assertEquals(3, player.getBattalions().size());
    }
    
    @Test
    public void addBattalion1 () throws Exception
    {
        player.addBattalion(new Battalion("battalion1", PersonnageType.ORC, 5, 7.5f));
        player.addBattalion(new Battalion("battalion2", PersonnageType.TAUREN, 5, 11.7f));
        player.addBattalion(new Battalion("battalion3", PersonnageType.ORC, 5, 7.5f));
        
        assertEquals(3, player.getBattalions().size());
    }
    
    @Test
    public void addArmie () throws Exception
    {
        Army army1 = new Army("army1", new Human("human1", "bleu"));
        Army army2 = new Army("army2", new Troll("troll1", "1664"));
        Army army3 = new Army("army3", new Human("human2", "gris"));
        
        player.addArmy(army1);
        player.addArmy(army2);
        player.addArmy(army3);
        
        assertEquals(3, player.getArmies().size());
    }
    
    @Test
    public void addArmie1 () throws Exception
    {
        Army army1 = new Army("army1", new Human("human1", "bleu"));
        Army army2 = new Army("army2", new Troll("troll1", "1664"));
        Army army3 = new Army("army3", new Human("human2", "gris"));
        
        ArrayList<Army> armies = new ArrayList<>();
        
        armies.add(army1);
        armies.add(army2);
        armies.add(army3);
        
        player.addArmy(armies);
        
        assertEquals(3, player.getArmies().size());
    }
    
    @Test
    public void equals () throws Exception
    {
        Player p1 = new Player("Player1", 500);
        Player p2 = new Player("Player1", 400);
        Player p3 = new Player(p1);
        
        assertTrue(p1.equals(p2));
        assertTrue(p1.equals(p2));
    }
    
}