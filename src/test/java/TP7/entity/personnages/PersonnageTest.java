package TP7.entity.personnages;

import TP7.weapons.Shield;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static TP7.factories.types.HandType.LEFT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnageTest
{
    private final float      hornSize = generateHornSize();
    private final float      delta    = 0.001f;
    private       Personnage human    = new Human("Radcliffe", "Bleu");
    private       Personnage tauren   = new Tauren("Powaeesha", hornSize);
    
    private float generateHornSize ()
    {
        //We set the EarSize random between 200mm and 700mm
        int randInt = ThreadLocalRandom.current().nextInt(200, 700);
        return randInt / 100;
    }
    
    @Test
    public void addWeapon () throws Exception
    {
        human.addWeapon(LEFT, new Shield());
        assertTrue(human.getWeapons().size() == 2);
    }
    
    @Test
    public void dropWeapon () throws Exception
    {
        human.addWeapon(LEFT, new Shield());
        human.dropWeapon(LEFT);
        assertTrue(human.getWeapons().size() == 1);
    }
    
    @Test
    public void replaceWeapon () throws Exception
    {
        //TODO
        //human.replaceWeapon(0, new Dager());
        //assertEquals(new Dager(), human.getWeapons().get(0));
    }
    
    @Test
    public void getWeapons () throws Exception
    {
        //TODO
        /*human.addWeapon(new Shield());
        ArrayList<weapons> listCompare = new ArrayList<>();
        listCompare.add(new Sword());
        listCompare.add(new Shield());
        
        assertEquals(listCompare, human.getWeapons());*/
    }
    
    @Test
    public void getName () throws Exception
    {
        assertEquals("Radcliffe", human.getName());
        assertEquals("Powaeesha", tauren.getName());
    }
    
    @Test
    public void getVitality1 () throws Exception
    {
        assertEquals(100f, human.getVitality(), delta);
        assertEquals(100f, tauren.getVitality(), delta);
    }
    
    @Test
    public void getVitality2 () throws Exception
    {
        human.Attack(tauren);
        
        assertEquals(100f, human.getVitality(), delta);
        assertEquals(95f, tauren.getVitality(), delta);
    }
    
    @Test
    public void getPower1 () throws Exception
    {
        assertEquals(25f, human.getPower(), delta);
        assertEquals(5f, tauren.getPower(), delta);
    }
    
    @Test
    public void getPower2 () throws Exception
    {
        human.Attack(tauren);
        tauren.Attack(human);
        
        assertEquals(25f, human.getPower(), delta);
        assertEquals(4.8f, tauren.getPower(), delta);
    }
    
    @Test
    public void getProtection1 () throws Exception
    {
        assertEquals(5f, human.getProtection(), delta);
        assertEquals(20f, tauren.getProtection(), delta);
    }
    
    @Test
    public void getProtection2 () throws Exception
    {
        human.Attack(tauren);
        tauren.Attack(human);
        
        assertEquals(5f, human.getProtection(), delta);
        assertEquals(19f, tauren.getProtection(), delta);
    }
    
    @Test
    public void attack () throws Exception
    {
        human.Attack(tauren);
        assertEquals(95f, tauren.getVitality(), delta);
    }
}