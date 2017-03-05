package TP7.weapons.improvements;

import TP7.weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponImprover	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
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

