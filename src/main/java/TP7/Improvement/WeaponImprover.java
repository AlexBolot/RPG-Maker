package TP7.Improvement;

import TP7.Weapon.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponImprover	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 02:04
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class WeaponImprover extends Weapon
{
    protected Weapon weapon;
    
    protected void setWeapon (Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    public abstract float getPower ();
    
    public abstract float getProtection ();
}

