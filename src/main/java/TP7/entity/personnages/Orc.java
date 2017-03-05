package TP7.entity.personnages;

import TP7.factories.WeaponFactory;
import TP7.factories.types.WeaponType;

import static TP7.factories.types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Orc	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:57
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
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.SWORD));
        setPrice(10);
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
    
    @SuppressWarnings("ConstantConditions")
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Orc)) return false;
        
        Orc humanCompare = (Orc) obj;
        
        Boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        Boolean sameEarSize = this.getEarSize() == humanCompare.getEarSize();
        
        return sameName && sameEarSize && super.equals(obj);
    }
}

