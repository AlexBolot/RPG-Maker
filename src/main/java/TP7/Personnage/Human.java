package TP7.Personnage;

import TP7.Weapon.Sword;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Human	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 14:20
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Human extends Personnage
{
    private String eyeColor;
    
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
    
    private void setEyeColor (String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return "Human : \t" + getName() + "\nEyeColor : \t" + getEyeColor() + "\nWeapons : \t" + getWeapons();
    }
}