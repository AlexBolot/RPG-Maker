package TP7.factories;

import TP7.factories.types.ImprovementType;
import TP7.factories.types.WeaponType;
import TP7.weapons.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponFactoryTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class WeaponFactoryTest {
    @SuppressWarnings("FieldCanBeLocal")
    private final float delta = 0.001f;

    @Test
    public void CreateAndImprove() {
        WeaponFactory wf = new WeaponFactory();

        Weapon weapon = wf.createWeapon(WeaponType.SWORD);

        weapon = wf.improve(ImprovementType.BUFF, weapon, 5);

        assertEquals(30, weapon.getPower(), delta);
        assertEquals(10, weapon.getProtection(), delta);

        weapon = wf.improve(ImprovementType.ENCHANT, weapon, 10);

        assertEquals(300, weapon.getPower(), delta);
        assertEquals(100, weapon.getProtection(), delta);
    }

    @Test
    public void CreateWithNameAndImprove() {
        WeaponFactory wf = new WeaponFactory();

        Weapon w = wf.improve(ImprovementType.BUFF, "excalibur", 5);

        assertEquals(30, w.getPower(), delta);
        assertEquals(10, w.getProtection(), delta);

        w = wf.improve(ImprovementType.ENCHANT, "excalibur", 10);

        assertEquals(300, w.getPower(), delta);
        assertEquals(100, w.getProtection(), delta);
    }

    @Test
    public void NameAndRename() {
        WeaponFactory wf = new WeaponFactory();
        Weapon weapon = wf.createWeapon(WeaponType.SWORD);
        weapon = wf.name(weapon, "Ragnarok");

        assertEquals("Weapon : power = 25.0, protection = 5.0, Name = Ragnarok", weapon.toString());

        weapon = wf.rename("Ragnarok", "CureDent");

        assertEquals("Weapon : power = 25.0, protection = 5.0, Name = CureDent", weapon.toString());
    }
}