package TP7.Weapons.Improvements;

import TP7.Weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The NamedWeapon	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("WeakerAccess")
public class NamedWeapon extends WeaponImprover
{
    private String weaponName;
    
    public NamedWeapon (Weapon weapon, String weaponName)
    {
        setWeapon(weapon);
        setWeaponName(weaponName);
    }
    
    //region Getters and Setters
    public String getWeaponName ()
    {
        return weaponName;
    }
    
    private void setWeaponName (String weaponName)
    {
        this.weaponName = weaponName;
    }
    
    @Override
    public float getPower ()
    {
        return weapon.getPower();
    }
    
    @Override
    public float getProtection ()
    {
        return weapon.getProtection();
    }
    
    //endregion
    
    @Override
    public String toString ()
    {
        return (super.toString() + ", Name = " + getWeaponName()).substring(7);
    }
}
