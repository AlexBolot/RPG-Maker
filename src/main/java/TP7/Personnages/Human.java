package TP7.Personnages;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Human	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 22:39
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("WeakerAccess")
public class Human extends Personnage
{
    private String eyeColor;
    
    public Human (String Name, String EyeColor)
    {
        setName(Name);
        setEyeColor(EyeColor);
        addWeapon(new WeaponFactory().createWeapon(WeaponType.SWORD));
    }
    
    //region Getters and Setters
    public String getEyeColor ()
    {
        return eyeColor;
    }
    
    private void setEyeColor (String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return super.toString() + "\tEyeColor : \t" + getEyeColor() + "\n";
    }
}