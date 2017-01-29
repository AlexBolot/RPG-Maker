package TP7.Improvement;

import TP7.Weapon.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Buff	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 15:37
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Buff extends WeaponImprover
{
    private float coeficient;
    
    public Buff (Weapon weapon, float coeficient)
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
        return weapon.getPower() + coeficient;
    }
    
    @Override
    public float getProtection ()
    {
        return weapon.getProtection() + coeficient;
    }
    //endregion
}