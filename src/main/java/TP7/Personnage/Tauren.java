package TP7.Personnage;

import TP7.Weapon.Shield;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Tauren	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 01:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Tauren extends Personnage
{
    protected float hornSize;
    
    public Tauren (String Name, float HornSize)
    {
        setName(Name);
        setHornSize(HornSize);
        addWeapon(new Shield());
    }
    
    //region Getters and Setters
    public float getHornSize ()
    {
        return hornSize;
    }
    
    public void setHornSize (float hornSize)
    {
        this.hornSize = hornSize;
    }
    //endregion
}

