package TP7.Entity.Personnages;

import TP7.Entity.Entity;
import TP7.Factories.Types.HandType;
import TP7.Weapons.Weapon;

import java.util.HashMap;

import static TP7.Factories.Types.HandType.LEFT;
import static TP7.Factories.Types.HandType.RIGHT;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Personnage	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:48
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "SameParameterValue"})
public abstract class Personnage extends Entity
{
    private int price;
    private HashMap<HandType, Weapon> weapons = new HashMap<>();
    private String name;
    private float vitality = 100;
    
    //region Getters and Setters
    public void addWeapon (HandType hand, Weapon newWeapon)
    {
        if(!getWeapons().containsKey(hand)) weapons.put(hand, newWeapon);
    }
    
    public void dropWeapon (HandType hand)
    {
        if(weapons.containsKey(hand)) getWeapons().remove(hand);
    }
    
    public void replaceWeapon (HandType hand, Weapon newWeapon)
    {
        getWeapons().remove(hand);
        addWeapon(hand, newWeapon);
    }
    
    public Weapon getWeapon (HandType hand)
    {
        if(getWeapons().containsKey(hand)) return getWeapons().get(hand);
        return null;
    }
    
    public HashMap<HandType, Weapon> getWeapons ()
    {
        return weapons;
    }
    
    public String getName ()
    {
        return name;
    }
    
    protected void setName (String name)
    {
        this.name = name;
    }
    
    public float getVitality ()
    {
        return vitality;
    }
    
    private void setVitality (float vitality)
    {
        this.vitality = vitality;
    }
    
    public int getPrice ()
    {
        return price;
    }
    
    protected void setPrice (int price)
    {
        this.price = price;
    }
    
    public float getPower ()
    {
        HandType attackingHand;
    
        if(getWeapons().containsKey(LEFT))
        {
            float rightHandPower = getWeapon(RIGHT).getPower();
            float leftHandPower = getWeapon(LEFT).getPower();
            attackingHand = rightHandPower < leftHandPower ? LEFT : RIGHT;
        }
        else
        {
            attackingHand = RIGHT;
        }
    
        float tempPower = getWeapons().get(attackingHand).getPower() * (getVitality() / 100f);
        return Math.round(tempPower * 10f) / 10f;
    }
    
    public float getProtection ()
    {
        HandType defendingHand;
    
        if(getWeapons().containsKey(LEFT))
        {
            float rightHandPotection = getWeapon(RIGHT).getProtection();
            float leftHandPotection = getWeapon(LEFT).getProtection();
            defendingHand = rightHandPotection < leftHandPotection ? LEFT : RIGHT;
        }
        else
        {
            defendingHand = RIGHT;
        }
    
        float tempProtection = getWeapons().get(defendingHand).getProtection() * (getVitality() / 100f);
        return Math.round(tempProtection * 10f) / 10f;
    }
    //endregion
    
    public void Attack (Personnage target)
    {
        float damageDealt;
        
        if(getPower() - target.getProtection() < 0)
        {
            damageDealt = 0;
        }
        else
        {
            damageDealt = getPower() - target.getProtection();
        }
        
        target.setVitality(target.getVitality() - damageDealt);
    }
    
    @Override
    public String toString ()
    {
        String className = this.getClass().toString().substring(29);
        return className + " : \t" + getName() + "\tWeapons : \t" + getWeapons();
    }
    
    @SuppressWarnings("ConstantConditions")
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Personnage)) return false;
        
        Personnage persoCompare = (Personnage) obj;
        
        return persoCompare.getName().equalsIgnoreCase(this.getName());
    }
}

