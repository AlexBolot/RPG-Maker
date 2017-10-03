package TP7.weapons.improvements;

import TP7.weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The EnchantedWeapon	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 04/10/17 11:32
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 <h2>Class representing an enchanted weapon</h2>
 <h3>This is used to increase the stats of a weapon</h3>

 <h3>Attributes :</h3>
 —> <i>coeficient</i> : The coeficient to apply on the weapon's stats
 —> The other attributes are inherited<br>
 —> See the {@link WeaponImprover WeaponImprover} class

 <h3>Constructor :</h3>
 —> <i>weapon</i> : the weapon to enchant
 —> <i>coeficient</i> : the coeficient to apply on the weapon's stats
 */
public class EnchantedWeapon extends WeaponImprover
{
    private float coeficient;

    /**
     <h3>Default Constructor with weapon and coeficient</h3>

     @param weapon     The weapon to enchant
     @param coeficient The coeficient to apply on the weapon's stats
     */
    public EnchantedWeapon (Weapon weapon, float coeficient)
    {
        setWeapon(weapon);
        setCoeficient(coeficient);
    }

    //region Getters and Setters

    private void setCoeficient (float coeficient)
    {
        this.coeficient = coeficient;
    }

    @Override
    public float getPower ()
    {
        return weapon.getPower() * coeficient;
    }

    @Override
    public float getProtection ()
    {
        return weapon.getProtection() * coeficient;
    }

    //endregion
}