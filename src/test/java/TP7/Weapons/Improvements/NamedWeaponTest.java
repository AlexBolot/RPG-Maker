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
 . The NamedWeaponTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 19:49
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class NamedWeaponTest
{
    private final float  delta  = 0.001f;
    private       Weapon dager  = new Dager();
    private       Weapon sword  = new Sword();
    private       Weapon shield = new Shield();
    
    @Test
    public void getWeaponName () throws Exception
    {
        dager = new NamedWeapon(dager, "dager1");
        sword = new NamedWeapon(sword, "sword1");
        shield = new NamedWeapon(shield, "shield1");
        
        assertEquals("dager1", ((NamedWeapon) dager).getWeaponName());
        assertEquals("sword1", ((NamedWeapon) sword).getWeaponName());
        assertEquals("shield1", ((NamedWeapon) shield).getWeaponName());
    }
    
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
        dager = new NamedWeapon(dager, "dager1");
        sword = new NamedWeapon(sword, "sword1");
        shield = new NamedWeapon(shield, "shield1");
        
        assertEquals("Weapon : power = 20.0, protection = 10.0, Name = dager1", dager.toString());
        assertEquals("Weapon : power = 25.0, protection = 5.0, Name = sword1", sword.toString());
        assertEquals("Weapon : power = 5.0, protection = 20.0, Name = shield1", shield.toString());
    }
    
}