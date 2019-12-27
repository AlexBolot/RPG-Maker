package TP7.entity.personnages;

import TP7.factories.WeaponFactory;
import TP7.factories.types.WeaponType;

import static TP7.factories.types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Tauren	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Tauren extends Character {
    private float hornSize;

    public Tauren(String Name, float HornSize) {
        setName(Name);
        setHornSize(HornSize);
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.SHIELD));
        setPrice(2);
    }

    //region Getters and Setters
    public float getHornSize() {
        return hornSize;
    }

    private void setHornSize(float hornSize) {
        this.hornSize = hornSize;
    }
    //endregion

    @Override
    public String toString() {
        return super.toString() + "\tHornSize : \t" + getHornSize() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Tauren)) return false;

        Tauren humanCompare = (Tauren) obj;

        boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        boolean sameHornSize = this.getHornSize() == humanCompare.getHornSize();

        return sameName && sameHornSize && super.equals(obj);
    }
}

