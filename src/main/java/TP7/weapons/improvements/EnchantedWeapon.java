package TP7.weapons.improvements;

import TP7.weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The EnchantedWeapon	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class EnchantedWeapon extends WeaponImprover
{
    private float coeficient;
    
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