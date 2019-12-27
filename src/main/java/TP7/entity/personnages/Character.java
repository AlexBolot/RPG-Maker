package TP7.entity.personnages;

import TP7.entity.Entity;
import TP7.factories.types.HandType;
import TP7.weapons.Weapon;

import javax.management.openmbean.InvalidKeyException;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.HashMap;

import static TP7.AssertUtils.assertNotEmpty;
import static TP7.AssertUtils.assertParamsNotNull;
import static TP7.factories.types.HandType.LEFT;
import static TP7.factories.types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Character	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 * <h2>Abstract class representing a Character</h2>
 *
 * <h3>Attributes :</h3>
 * —> <i>name</i> : Name of the chatacter<br>
 * —> <i>price</i> : Cost of the character<br>
 * —> <i>vitality</i> : Health points of the character<br>
 * —> <i>weapons {HandType, Weapon}</i> : Weapons held by the character<br>
 *
 * <h3>Noticable methods :</h3>
 * —> <i>attack</i> : Makes the current character attack another character<br>
 * —> Other methods are for adding, droping, getting and setting weapons, vitality, etc.
 */
public abstract class Character extends Entity {
    private String name;
    private int price;
    private float vitality = 100;

    private HashMap<HandType, Weapon> weapons = new HashMap<>();

    //region Getters and Setters
    public void addWeapon(HandType hand, Weapon newWeapon) throws IllegalArgumentException {
        assertParamsNotNull(hand, newWeapon);
        assertNotEmpty(getWeapons(), "Character's weapon list");
        if (getWeapons().containsKey(hand)) throw new KeyAlreadyExistsException("Key " + hand + " already exists");

        getWeapons().put(hand, newWeapon);
    }

    public void dropWeapon(HandType hand) throws IllegalArgumentException {
        assertParamsNotNull(hand);
        assertNotEmpty(getWeapons(), "Character's weapon list");
        if (!getWeapons().containsKey(hand)) throw new InvalidKeyException("Key " + hand + " doesn't exists");

        if (weapons.containsKey(hand)) getWeapons().remove(hand);
    }

    public void replaceWeapon(HandType hand, Weapon newWeapon) throws IllegalArgumentException {
        assertParamsNotNull(hand, newWeapon);
        assertNotEmpty(getWeapons(), "Character's weapon list");
        if (!getWeapons().containsKey(hand)) throw new InvalidKeyException("Key " + hand + " doesn't exists");

        getWeapons().remove(hand);
        addWeapon(hand, newWeapon);
    }

    public Weapon getWeapon(HandType hand) throws IllegalArgumentException {
        assertParamsNotNull(hand);
        assertNotEmpty(getWeapons(), "Character's weapon list");
        if (!getWeapons().containsKey(hand)) throw new InvalidKeyException("Key " + hand + " doesn't exists");

        return getWeapons().get(hand);
    }

    public HashMap<HandType, Weapon> getWeapons() {
        return weapons;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public float getVitality() {
        return vitality;
    }

    private void setVitality(float vitality) {
        this.vitality = vitality;
    }

    public int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    public float getPower() throws IllegalArgumentException {
        assertNotEmpty(getWeapons(), "Character's weapon list");

        HandType attackingHand;

        if (getWeapons().containsKey(LEFT)) {
            float rightHandPower = getWeapon(RIGHT).getPower();
            float leftHandPower = getWeapon(LEFT).getPower();
            attackingHand = rightHandPower < leftHandPower ? LEFT : RIGHT;
        } else {
            attackingHand = RIGHT;
        }

        float tempPower = getWeapons().get(attackingHand).getPower() * (getVitality() / 100f);
        return Math.round(tempPower * 10f) / 10f;
    }

    public float getProtection() throws IllegalArgumentException {
        assertNotEmpty(getWeapons(), "Character's weapon list");

        HandType defendingHand;

        if (getWeapons().containsKey(LEFT)) {
            float rightHandPotection = getWeapon(RIGHT).getProtection();
            float leftHandPotection = getWeapon(LEFT).getProtection();
            defendingHand = rightHandPotection < leftHandPotection ? LEFT : RIGHT;
        } else {
            defendingHand = RIGHT;
        }

        float tempProtection = getWeapons().get(defendingHand).getProtection() * (getVitality() / 100f);
        return Math.round(tempProtection * 10f) / 10f;
    }
    //endregion

    /**
     * <h2>Makes the current character attack another character</h2>
     *
     * <b>Effect :</b><br>
     * [target].vitality = [target].protection - this.power
     *
     * @param target The character to attack.
     */
    public void attack(Character target) throws IllegalArgumentException {
        assertParamsNotNull(target);

        float damageDealt;

        damageDealt = getPower() - target.getProtection() < 0 ? 0 : getPower() - target.getProtection();

        target.setVitality(target.getVitality() - damageDealt);
    }

    @Override
    public String toString() {
        String className = this.getClass().toString().substring(29);
        return className + " : \t" + getName() + "\tweapons : \t" + getWeapons();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Character)) return false;

        Character persoCompare = (Character) obj;

        return persoCompare.getName().equalsIgnoreCase(this.getName());
    }
}

