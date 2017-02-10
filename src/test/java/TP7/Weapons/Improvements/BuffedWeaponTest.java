package TP7.Weapons.Improvements;

import TP7.Weapons.Dager;
import TP7.Weapons.Shield;
import TP7.Weapons.Sword;
import TP7.Weapons.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The BuffedWeaponTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class BuffedWeaponTest
{
    private final float  delta  = 0.001f;
    private       Weapon dager  = new Dager();
    private       Weapon sword  = new Sword();
    private       Weapon shield = new Shield();
    
    @Test
    public void getPower () throws Exception
    {
        dager = new BuffedWeapon(dager, 2);
        sword = new BuffedWeapon(sword, 2);
        shield = new BuffedWeapon(shield, 2);
        
        assertEquals(22, dager.getPower(), delta);
        assertEquals(27, sword.getPower(), delta);
        assertEquals(7, shield.getPower(), delta);
    }
    
    @Test
    public void getProtection () throws Exception
    {
        dager = new BuffedWeapon(dager, 2);
        sword = new BuffedWeapon(sword, 2);
        shield = new BuffedWeapon(shield, 2);
        
        assertEquals(12, dager.getProtection(), delta);
        assertEquals(7, sword.getProtection(), delta);
        assertEquals(22, shield.getProtection(), delta);
    }
}