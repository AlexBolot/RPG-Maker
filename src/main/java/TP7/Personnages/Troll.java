package TP7.Personnages;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Troll	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 17:41
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("WeakerAccess")
public class Troll extends Personnage
{
    private String favoriteBeer;
    
    public Troll (String Name, String NameBeer)
    {
        setName(Name);
        setFavoriteBeer(NameBeer);
        addWeapon(new WeaponFactory().createWeapon(WeaponType.DAGER));
        setPrice(5);
    }
    
    //region Getters and Setters
    public String getFavoriteBeer ()
    {
        return favoriteBeer;
    }
    
    private void setFavoriteBeer (String nameBeer)
    {
        this.favoriteBeer = nameBeer;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return super.toString() + "\tFavoriteBeer : \t" + getFavoriteBeer() + "\n";
    }
    
    @SuppressWarnings("ConstantConditions")
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Troll)) return false;
        
        Troll humanCompare = (Troll) obj;
        
        Boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        Boolean sameBeer = this.getFavoriteBeer().equalsIgnoreCase(humanCompare.getFavoriteBeer());
        
        return sameName && sameBeer && super.equals(obj);
    }
    
}