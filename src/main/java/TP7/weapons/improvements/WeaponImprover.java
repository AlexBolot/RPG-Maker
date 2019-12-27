package TP7.weapons.improvements;

import TP7.weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The WeaponImprover	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 * <h2>Abstract class representing a weapon improvement</h2>
 * <h3>This class implements the Decorator Pattern</h3>
 *
 * <h3>Attributes :</h3>
 * —> <i>weapon</i> : The weapon contained in the weaponImprover. This is the weapon to improve. It can be a weaponImprover itself<br>
 * —> The other attributes are inherited. See the {@link Weapon Weapon} class<br>
 *
 * <h3>Noticable methods :</h3>
 * There are no interesting methods
 */
public abstract class WeaponImprover extends Weapon {
    protected Weapon weapon;

    //region Getters and Setters
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract float getPower();

    public abstract float getProtection();
    //endregion

    public String toString() {
        String className = this.getClass().toString().substring(29);
        return className + " : power = " + getPower() + ", protection = " + getProtection();
    }
}

