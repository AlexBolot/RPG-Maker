package TP7.entity.personnages;

import TP7.factories.WeaponFactory;
import TP7.factories.types.WeaponType;

import static TP7.AssertUtils.assertNotNullOrEmpty;
import static TP7.AssertUtils.assertStrictlyPositive;
import static TP7.factories.types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Orc	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 * <h2>Class representing an Orc</h2>
 *
 * <h3>Attributes :</h3>
 * —> <i>earSize</i> : The orc's earSize<br>
 * —> The other attributes are inherited<br>
 * —> See the {@link Character Character} class
 *
 * <h3>Constructor :</h3>
 * —> The constructor has no parameters<br>
 * —> It sets [power] = 20 and [protection] = 10
 */
public class Orc extends Character {
    private float earSize;

    /**
     * <h3>Default constructor :</h3>
     * —> sets params name and earSize<br>
     * —> sets [price] = 10<br>
     * —> adds [weapons] = SWORD
     */
    public Orc(String name, float earSize) {
        assertNotNullOrEmpty(name, "name");
        assertStrictlyPositive(earSize, "earSize");

        setName(name);
        setEarSize(earSize);
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.SWORD));
        setPrice(10);
    }

    //region Getters and Setters
    public float getEarSize() {
        return earSize;
    }

    private void setEarSize(float earSize) {
        this.earSize = earSize;
    }
    //endregion

    @Override
    public String toString() {
        return super.toString() + "\tEarSize : \t" + getEarSize() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Orc)) return false;

        Orc humanCompare = (Orc) obj;

        boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        boolean sameEarSize = this.getEarSize() == humanCompare.getEarSize();

        return sameName && sameEarSize && super.equals(obj);
    }
}

