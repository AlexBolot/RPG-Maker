package TP7.weapons.improvements;

import TP7.weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The NamedWeapon	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 04/10/17 08:22
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 <h2>Class representing a neamed weapon</h2>
 <h3>This is used to give a name to a weapon</h3>

 <h3>Attributes :</h3>
 —> <i>weaponName</i> : The name given to the weapon
 —> The other attributes are inherited<br>
 —> See the {@link WeaponImprover WeaponImprover} class

 <h3>Constructor :</h3>
 —> <i>weapon</i> : the weapon to name
 —> <i>weaponName</i> : the name of the weapon
 */
@SuppressWarnings ("ALL")
public class NamedWeapon extends WeaponImprover
{
    private String weaponName;

    /**
     <h3>Default Constructor with weapon and weaponName</h3>

     @param weapon     The weapon to name
     @param weaponName The name of the weapon
     */
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
