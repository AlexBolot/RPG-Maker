package TP7.Personnage;

import TP7.Weapon.Sword;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Orc	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 14:20
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Orc extends Personnage
{
    private float earSize;
    
    public Orc (String Name, float EarSize)
    {
        setName(Name);
        setEarSize(EarSize);
        addWeapon(new Sword());
    }
    
    //region Getters and Setters
    public float getEarSize ()
    {
        return earSize;
    }
    
    private void setEarSize (float earSize)
    {
        this.earSize = earSize;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return "Orc : \t" + getName() + "\nEarSize : \t" + getEarSize() + "\nWeapons : \t" + getWeapons();
    }
}

