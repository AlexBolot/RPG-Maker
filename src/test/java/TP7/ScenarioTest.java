package TP7;

import TP7.entity.personnages.Orc;
import TP7.entity.personnages.Tauren;
import TP7.entity.personnages.Troll;
import TP7.weapons.Weapon;
import TP7.weapons.improvements.BuffedWeapon;
import TP7.weapons.improvements.EnchantedWeapon;
import org.junit.Test;

import static TP7.factories.types.HandType.RIGHT;
import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The ScenarioTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class ScenarioTest {
    private final float delta = 0.001f;

    @Test
    public void scenario() throws Exception {
        //The 2 characters are created.
        Tauren diablon = new Tauren("Diablon", 15);
        Orc azag = new Orc("Azag", 5);

        //region //Test of All Getters ======

        //Test of Names getters
        assertEquals("Diablon", diablon.getName());
        assertEquals("Azag", azag.getName());

        //Test of Vitality getters
        assertEquals(100, diablon.getVitality(), delta);
        assertEquals(100, azag.getVitality(), delta);

        //Test of Power getters
        assertEquals(5, diablon.getPower(), delta);
        assertEquals(25, azag.getPower(), delta);

        //Test of Protection getters
        assertEquals(20, diablon.getProtection(), delta);
        assertEquals(5, azag.getProtection(), delta);

        //endregion

        diablon.attack(azag);

        // pow:5 prot:5 => 0 damage dealt to Azag.
        assertEquals(100, diablon.getVitality(), delta);
        assertEquals(100, azag.getVitality(), delta);

        azag.attack(diablon);

        // pow:25 prot:20 => 5 damage dealt to Diablon.
        assertEquals(95, diablon.getVitality(), delta);
        assertEquals(100, azag.getVitality(), delta);

        // Diablon enchants his weapon with EnchantedWeapon coef 2.
        // Diablon's weapon's power : 10.
        // Diablon's total power : 10 * 0.95 = 9.5 (due to his vitality).
        Weapon weaponDiablon = new EnchantedWeapon(diablon.getWeapon(RIGHT), 2);
        diablon.replaceWeapon(RIGHT, weaponDiablon);

        diablon.attack(azag);

        // pow:9.5 prot:5 => 4.6 damage dealt to Azag.
        assertEquals(95, diablon.getVitality(), delta);
        assertEquals(95.5f, azag.getVitality(), delta);

        // Diablon enchants his weapon with BuffedWeapon coef 3.
        // Diablon's weapon's power : 13.
        // Diablon's total power : 13 * 0.95 = 12.3 (due to his vitality).
        weaponDiablon = new BuffedWeapon(diablon.getWeapon(RIGHT), 3);
        diablon.replaceWeapon(RIGHT, weaponDiablon);

        diablon.attack(azag);

        // pow:12.3 prot:5*0.955 = 4.8 => 7.6 damage dealt to azag
        assertEquals(95, diablon.getVitality(), delta);
        assertEquals(88f, azag.getVitality(), delta);

        //....

        Troll troll = new Troll("ArKor", "Heineken");

        //etc.

    }

}
