package TP7;

import TP7.Personnage.Human;
import TP7.Personnage.Orc;
import TP7.Personnage.Tauren;
import TP7.Personnage.Troll;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnagePackageTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 16:43
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnagePackageTest
{
    private Human human = new Human("Radcliffe", "Bleu");
    ;
    private Orc orc = new Orc("Thrugal", getRandFloat(2, 7));
    ;
    private Tauren tauren = new Tauren("Powaeesha", getRandFloat(7, 20));
    ;
    private Troll troll = new Troll("Thrugal", "Kwak");
    ;
    
    private float getRandFloat (int min, int max)
    {
        int randInt = ThreadLocalRandom.current().nextInt(min * 100, (max + 1) * 100);
        return randInt / 100;
    }
    
    //region //================== Tests GetName ==================//
    
    @Test   //Test if Human's name is well definied and accessible. => True
    public void getName_Human () throws Exception
    {
        assertEquals("Radcliffe", human.getName());
    }
    
    @Test   //Test if Orc's name is well definied and accessible. => True
    public void getName_Orc () throws Exception
    {
        assertEquals("Thrugal", orc.getName());
    }
    
    @Test   //Test if Tauren's name is well definied and accessible. => True
    public void getName_Tauren () throws Exception
    {
        assertEquals("Powaeesha", tauren.getName());
    }
    
    @Test   //Test if Troll's name is well definied and accessible. => True
    public void getName_Troll () throws Exception
    {
        assertEquals("Thrugal", troll.getName());
    }
    
    //endregion
}