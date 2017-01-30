package TP7.Personnage;

import TP7.Weapon.Weapon;

import java.util.ArrayList;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Personnage	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 14:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class Personnage
{
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private String name;
    private float vitality = 100;
    
    //region Getters and Setters
    public void addWeapon (Weapon newWeapon)
    {
        if(getWeapons().size() < 2) getWeapons().add(newWeapon);
    }
    
    protected void dropWeapon (int index)
    {
        if(getWeapons().size() > index) getWeapons().remove(index);
    }
    
    public void replaceWeapon (int index, Weapon newWeapon)
    {
        getWeapons().remove(index);
        addWeapon(newWeapon);
    }
    
    public Weapon getWeapon (int index)
    {
        if(getWeapons().size() > index) return getWeapons().get(index);
        return null;
    }
    
    public ArrayList<Weapon> getWeapons ()
    {
        return weapons;
    }
    
    private void setWeapons (ArrayList<Weapon> weapons)
    {
        this.weapons = weapons;
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
    
    public float getPower ()
    {
        float tempPower = getWeapons().get(0).getPower() * (getVitality() / 100f);
    
        return Math.round(tempPower * 10f) / 10f;
    }
    
    public float getProtection ()
    {
        float tempProtection = getWeapons().get(0).getProtection() * (getVitality() / 100f);
    
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
}

