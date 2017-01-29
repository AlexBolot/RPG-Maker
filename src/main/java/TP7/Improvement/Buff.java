package TP7.Improvement;

import TP7.Weapon.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Buff	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 01:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Buff extends WeaponImprover
{
    private float powerBonus;
    private float protectionBonus;
    
    public Buff (Weapon weapon, float powerBonus, float protectionBonus)
    {
        setWeapon(weapon);
        setPowerBonus(powerBonus);
        setProtectionBonus(protectionBonus);
    }
    
    //region Getters and Setters
    private void setPowerBonus (float newPowerBonus)
    {
        powerBonus = newPowerBonus;
    }
    
    private void setProtectionBonus (float newProtectionBonus) { protectionBonus = newProtectionBonus;}
    
    @Override
    public float getPower ()
    {
        return weapon.getPower() + powerBonus;
    }
    
    @Override
    public float getProtection ()
    {
        return weapon.getProtection() + protectionBonus;
    }
    //endregion
}