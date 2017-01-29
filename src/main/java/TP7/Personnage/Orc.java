package TP7.Personnage;

import TP7.Weapon.Sword;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Orc	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 02:04
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Orc extends Personnage
{
    protected float earSize;
    
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
    
    public void setEarSize (float earSize)
    {
        this.earSize = earSize;
    }
    //endregion
}

