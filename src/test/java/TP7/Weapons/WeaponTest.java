package TP7.Weapons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class WeaponTest
{
    private final float  delta  = 0.001f;
    private final Weapon dager  = new Dager();
    private final Weapon shield = new Shield();
    private final Weapon sword  = new Sword();
    
    @Test
    public void getPower () throws Exception
    {
        assertEquals(20, dager.getPower(), delta);
        assertEquals(25, sword.getPower(), delta);
        assertEquals(5, shield.getPower(), delta);
    }
    
    @Test
    public void getProtection () throws Exception
    {
        assertEquals(10, dager.getProtection(), delta);
        assertEquals(5, sword.getProtection(), delta);
        assertEquals(20, shield.getProtection(), delta);
    }
    
    @Test
    public void ToString () throws Exception
    {
        assertEquals("Dager : power = 20.0, protection = 10.0", dager.toString());
        assertEquals("Sword : power = 25.0, protection = 5.0", sword.toString());
        assertEquals("Shield : power = 5.0, protection = 20.0", shield.toString());
    }
}