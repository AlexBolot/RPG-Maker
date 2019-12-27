package TP7.weapons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class WeaponTest {
    private final float delta = 0.001f;
    private final Weapon dager = new Dager();
    private final Weapon shield = new Shield();
    private final Weapon sword = new Sword();

    @Test
    public void getPower() {
        assertEquals(20, dager.getPower(), delta);
        assertEquals(25, sword.getPower(), delta);
        assertEquals(5, shield.getPower(), delta);
    }

    @Test
    public void getProtection() {
        assertEquals(10, dager.getProtection(), delta);
        assertEquals(5, sword.getProtection(), delta);
        assertEquals(20, shield.getProtection(), delta);
    }

    @Test
    public void ToString() {
        assertEquals("Dager : power = 20.0, protection = 10.0", dager.toString());
        assertEquals("Sword : power = 25.0, protection = 5.0", sword.toString());
        assertEquals("Shield : power = 5.0, protection = 20.0", shield.toString());
    }
}