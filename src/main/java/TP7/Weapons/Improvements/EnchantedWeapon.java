package TP7.Weapons.Improvements;

import TP7.Weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The EnchantedWeapon	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 21:32
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