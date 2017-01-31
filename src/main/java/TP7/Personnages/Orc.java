package TP7.Personnages;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Orc	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 22:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("WeakerAccess")
public class Orc extends Personnage
{
    private float earSize;
    
    public Orc (String Name, float EarSize)
    {
        setName(Name);
        setEarSize(EarSize);
        addWeapon(new WeaponFactory().createWeapon(WeaponType.SWORD));
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
        return super.toString() + "\tEarSize : \t" + getEarSize() + "\n";
    }
}

