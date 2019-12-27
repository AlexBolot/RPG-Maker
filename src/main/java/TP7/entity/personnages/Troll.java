package TP7.entity.personnages;

import TP7.factories.WeaponFactory;
import TP7.factories.types.WeaponType;

import static TP7.factories.types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Troll	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Troll extends Character {
    private String favoriteBeer;

    public Troll(String Name, String NameBeer) {
        setName(Name);
        setFavoriteBeer(NameBeer);
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.DAGER));
        setPrice(5);
    }

    //region Getters and Setters
    public String getFavoriteBeer() {
        return favoriteBeer;
    }

    private void setFavoriteBeer(String nameBeer) {
        this.favoriteBeer = nameBeer;
    }
    //endregion

    @Override
    public String toString() {
        return super.toString() + "\tFavoriteBeer : \t" + getFavoriteBeer() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Troll)) return false;

        Troll humanCompare = (Troll) obj;

        boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        boolean sameBeer = this.getFavoriteBeer().equalsIgnoreCase(humanCompare.getFavoriteBeer());

        return sameName && sameBeer && super.equals(obj);
    }

}