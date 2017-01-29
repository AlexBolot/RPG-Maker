package TP7.Personnage;

import TP7.Weapon.Sword;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Human	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 01:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Human extends Personnage
{
    protected String eyeColor;
    
    public Human (String Name, String EyeColor)
    {
        setName(Name);
        setEyeColor(EyeColor);
        addWeapon(new Sword());
    }
    
    //region Getters and Setters
    public String getEyeColor ()
    {
        return eyeColor;
    }
    
    public void setEyeColor (String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    //endregion
}