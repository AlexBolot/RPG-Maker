package TP7.Groups;

import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.Human;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The ArmyTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 19:49
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
        Battalion p1 = new Battalion("battalion1", PersonnageType.ORC, 5, 7.5f);
        Battalion p2 = new Battalion("battalion2", PersonnageType.TAUREN, 5, 11.7f);
        Battalion p3 = new Battalion("battalion3", PersonnageType.ORC, 5, 7.5f);
        
        ArrayList<Battalion> battalions = new ArrayList<>();
        battalions.add(p1);
        battalions.add(p2);
        battalions.add(p3);
        
        army.addBattalion(battalions);
        
        assertEquals(3, army.getBattalions().size());
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
        
        army.addBattalion(battalions);
        
        assertEquals(3, army.getBattalions().size());
    }
    
    @Test
    public void addBattalion1 () throws Exception
    {
        army.addBattalion(new Battalion("battalion1", PersonnageType.ORC, 5, 7.5f));
        army.addBattalion(new Battalion("battalion2", PersonnageType.TAUREN, 5, 11.7f));
        army.addBattalion(new Battalion("battalion3", PersonnageType.ORC, 5, 7.5f));
        
        assertEquals(3, army.getBattalions().size());
    }
    
    @Test
    public void getPower () throws Exception
    {
        army.addBattalion(new Battalion("battalion1", PersonnageType.ORC, 5, 7.5f));
        army.addBattalion(new Battalion("battalion2", PersonnageType.TAUREN, 5, 11.7f));
        army.addBattalion(new Battalion("battalion3", PersonnageType.ORC, 5, 7.5f));
        
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