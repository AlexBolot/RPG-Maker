package TP7.Personnage;

import TP7.Weapon.Dager;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Troll	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 01:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Troll extends Personnage
{
    protected String nameBeer;
    
    public Troll (String Name, String NameBeer)
    {
        setName(Name);
        setNameBeer(NameBeer);
        addWeapon(new Dager());
    }
    
    //region Getters and Setters
    public String getNameBeer ()
    {
        return nameBeer;
    }
    
    public void setNameBeer (String nameBeer)
    {
        this.nameBeer = nameBeer;
    }
    //endregion
}