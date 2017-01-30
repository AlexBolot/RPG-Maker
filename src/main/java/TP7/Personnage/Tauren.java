package TP7.Personnage;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Tauren	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 16:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("WeakerAccess")
public class Tauren extends Personnage
{
    private float hornSize;
    
    public Tauren (String Name, float HornSize)
    {
        setName(Name);
        setHornSize(HornSize);
        addWeapon(new WeaponFactory().createWeapon(WeaponType.SHIELD));
    }
    
    //region Getters and Setters
    public float getHornSize ()
    {
        return hornSize;
    }
    
    private void setHornSize (float hornSize)
    {
        this.hornSize = hornSize;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return "Tauren : \t" + getName() + "\nHornSize : \t" + getHornSize() + "\nWeapons : \t" + getWeapons();
    }
}

