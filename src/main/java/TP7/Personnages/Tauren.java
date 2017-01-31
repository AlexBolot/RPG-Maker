package TP7.Personnages;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Tauren	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 17:41
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

