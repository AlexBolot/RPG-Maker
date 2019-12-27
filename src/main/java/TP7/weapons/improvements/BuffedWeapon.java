package TP7.weapons.improvements;

import TP7.weapons.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The BuffedWeapon	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 * <h2>Class representing a buffed weapon</h2>
 * <h3>This is used to increase the stats of a weapon</h3>
 *
 * <h3>Attributes :</h3>
 * —> <i>buff</i> : The bonus to add on the weapon's stats<br>
 * —> The other attributes are inherited<br>
 * —> See the {@link WeaponImprover WeaponImprover} class
 *
 * <h3>Constructor :</h3>
 * —> <i>weapon</i> : the weapon to enchant<br>
 * —> <i>buff</i> : the bonus to add on the weapon's stats
 */
public class BuffedWeapon extends WeaponImprover {
    private float coeficient;

    /**
     * <h3>Default Constructor with weapon and buff</h3>
     *
     * @param weapon The weapon to enchant
     * @param buff   The bonus to add on the weapon's stats
     */
    public BuffedWeapon(Weapon weapon, float buff) {
        setWeapon(weapon);
        setCoeficient(buff);
    }

    //region Getters and Setters
    private void setCoeficient(float coeficient) {
        this.coeficient = coeficient;
    }

    @Override
    public float getPower() {
        return weapon.getPower() + coeficient;
    }

    @Override
    public float getProtection() {
        return weapon.getProtection() + coeficient;
    }
    //endregion
}