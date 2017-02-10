package TP7.Entity.Personnages;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

import static TP7.Factories.Types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Human	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
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
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.SWORD));
        setPrice(10);
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
    
    @SuppressWarnings("ConstantConditions")
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Human)) return false;
        
        Human humanCompare = (Human) obj;
        
        Boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        Boolean sameColor = this.getEyeColor().equalsIgnoreCase(humanCompare.getEyeColor());
        
        return sameName && sameColor && super.equals(obj);
    }
}