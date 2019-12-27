package TP7.weapons.improvements;

import TP7.weapons.Dager;
import TP7.weapons.Shield;
import TP7.weapons.Sword;
import TP7.weapons.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The NamedWeaponTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class NamedWeaponTest {
    private final float delta = 0.001f;
    private Weapon dager = new Dager();
    private Weapon sword = new Sword();
    private Weapon shield = new Shield();

    @Test
    public void getWeaponName() {
        dager = new NamedWeapon(dager, "dager1");
        sword = new NamedWeapon(sword, "sword1");
        shield = new NamedWeapon(shield, "shield1");

        assertEquals("dager1", ((NamedWeapon) dager).getWeaponName());
        assertEquals("sword1", ((NamedWeapon) sword).getWeaponName());
        assertEquals("shield1", ((NamedWeapon) shield).getWeaponName());
    }

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
        dager = new NamedWeapon(dager, "dager1");
        sword = new NamedWeapon(sword, "sword1");
        shield = new NamedWeapon(shield, "shield1");

        assertEquals("Weapon : power = 20.0, protection = 10.0, Name = dager1", dager.toString());
        assertEquals("Weapon : power = 25.0, protection = 5.0, Name = sword1", sword.toString());
        assertEquals("Weapon : power = 5.0, protection = 20.0, Name = shield1", shield.toString());
    }

}