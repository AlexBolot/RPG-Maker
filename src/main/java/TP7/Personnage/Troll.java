package TP7.Personnage;

import TP7.Factories.Types.WeaponType;
import TP7.Factories.WeaponFactory;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Troll	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 16:21
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
        return "Troll : \t" + getName() + "\nFavoriteBeer : \t" + getFavoriteBeer() + "\nWeapons : \t" + getWeapons();
    }
    
}