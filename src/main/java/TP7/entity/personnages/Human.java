package TP7.entity.personnages;

import TP7.factories.WeaponFactory;
import TP7.factories.types.WeaponType;

import static TP7.AssertUtils.assertNotNullOrEmpty;
import static TP7.factories.types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Human	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 * <h2>Class representing a Human</h2>
 *
 * <h3>Attributes :</h3>
 * —> <i>eyeColor</i> : The human's eyeColor<br>
 * —> The other attributes are inherited<br>
 * —> See the {@link Character Character} class
 *
 * <h3>Constructor :</h3>
 * —> <i>name</i> : The name of the human<br>
 * —> <i>eyeColor</i> : The color of the human's eyes<br>
 * —> Sets [price] = 10<br>
 * —> Adds SWORD to [weapons]
 */
public class Human extends Character {
    private String eyeColor;

    /**
     * <h3>Constructor with Name and EyeColor :</h3>
     * —> Sets [price] = 10<br>
     * —> Adds SWORD to [weapons]
     *
     * @param name     The name of the human
     * @param eyeColor The color of the human's eyes
     */
    public Human(String name, String eyeColor) {
        assertNotNullOrEmpty(name, "name");
        assertNotNullOrEmpty(eyeColor, "eyeColor");

        setName(name);
        setEyeColor(eyeColor);
        addWeapon(RIGHT, new WeaponFactory().createWeapon(WeaponType.SWORD));
        setPrice(10);
    }

    //region Getters and Setters
    public String getEyeColor() {
        return eyeColor;
    }

    private void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    //endregion

    @Override
    public String toString() {
        return super.toString() + "\tEyeColor : \t" + getEyeColor() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Human)) return false;

        Human humanCompare = (Human) obj;

        boolean sameName = this.getName().equalsIgnoreCase(humanCompare.getName());
        boolean sameColor = this.getEyeColor().equalsIgnoreCase(humanCompare.getEyeColor());

        return sameName && sameColor && super.equals(obj);
    }
}