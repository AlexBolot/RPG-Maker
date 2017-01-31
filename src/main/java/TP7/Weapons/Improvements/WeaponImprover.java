package TP7.Weapons.Improvements;

import TP7.Weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponImprover	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 21:32
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
    
    public String toString ()
    {
        String className = this.getClass().toString().substring(29);
        return className + " : power = " + getPower() + ", protection = " + getProtection();
    }
}

