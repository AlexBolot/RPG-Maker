package TP7;

import TP7.Improvement.Buff;
import TP7.Improvement.Enchant;
import TP7.Personnage.Orc;
import TP7.Personnage.Tauren;
import TP7.Personnage.Troll;
import TP7.Weapon.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The ScenarioTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 14:20
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class ScenarioTest
{
    private final float delta = 0.001f;
    
    @Test
    public void scenario () throws Exception
    {
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
        
        diablon.Attack(azag);
        
        // pow:5 prot:5 => 0 damage dealt to Azag.
        assertEquals(100, diablon.getVitality(), delta);
        assertEquals(100, azag.getVitality(), delta);
        
        azag.Attack(diablon);
        
        // pow:25 prot:20 => 5 damage dealt to Diablon.
        assertEquals(95, diablon.getVitality(), delta);
        assertEquals(100, azag.getVitality(), delta);
        
        // Diablon enchants his weapon with Enchant coef 2.
        // Diablon's weapon's power : 10.
        // Diablon's total power : 10 * 0.95 = 9.5 (due to his vitality).
        Weapon weaponDiablon = new Enchant(diablon.getWeapon(0), 2);
        diablon.replaceWeapon(0, weaponDiablon);
        
        diablon.Attack(azag);
        
        // pow:9.5 prot:5 => 4.6 damage dealt to Azag.
        assertEquals(95, diablon.getVitality(), delta);
        assertEquals(95.5f, azag.getVitality(), delta);
        
        // Diablon enchants his weapon with Buff coef 3.
        // Diablon's weapon's power : 13.
        // Diablon's total power : 13 * 0.95 = 12.3 (due to his vitality).
        weaponDiablon = new Buff(diablon.getWeapon(0), 3);
        diablon.replaceWeapon(0, weaponDiablon);
        
        diablon.Attack(azag);
        
        // pow:12.3 prot:5*0.955 = 4.8 => 7.6 damage dealt to azag
        assertEquals(95, diablon.getVitality(), delta);
        assertEquals(88f, azag.getVitality(), delta);
        
        //....
        
        Troll troll = new Troll("ArKor", "Heineken");
        
        //etc.
        
    }
    
}
