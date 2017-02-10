package TP7.Entity.Personnages;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

import static TP7.Factories.Types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Tauren	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
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
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.SHIELD));
        setPrice(2);
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
        return super.toString() + "\tHornSize : \t" + getHornSize() + "\n";
    }
    
    @SuppressWarnings("ConstantConditions")
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Tauren)) return false;
        
        Tauren humanCompare = (Tauren) obj;
        
        Boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        Boolean sameHornSize = this.getHornSize() == humanCompare.getHornSize();
        
        return sameName && sameHornSize && super.equals(obj);
    }
}

