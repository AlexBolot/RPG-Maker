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
 . Last Modified : 29/01/17 02:04
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class Personnage
{
    protected ArrayList<Weapon> weapons;
    protected String            name;
    protected float vitality = 100;
    
    //region Getters and Setters
    protected void addWeapon (Weapon newWeapon)
    {
        weapons.add(newWeapon);
    }
    
    public void replaceWeapon (Weapon oldWeapon, Weapon newWeapon)
    {
        weapons.remove(oldWeapon);
        addWeapon(newWeapon);
    }
    
    public ArrayList<Weapon> getWeapons ()
    {
        return weapons;
    }
    
    public void setWeapons (ArrayList<Weapon> weapons)
    {
        this.weapons = weapons;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public void setName (String name)
    {
        this.name = name;
    }
    
    public float getVitality ()
    {
        return vitality;
    }
    
    public void setVitality (float vitality)
    {
        this.vitality = vitality;
    }
    
    public float getPower ()
    {
        //TODO : A expliciter...
        return weapons.get(0).getPower();
    }
    
    public float getProtection ()
    {
        //TODO : A expliciter
        return weapons.get(0).getProtection();
    }
    //endregion
    
    public void Attack (Personnage target)
    {
        float damageDealt = 0;
        
        if(target.getProtection() - getPower() < 0)
        {
            damageDealt = 0;
        }
        else
        {
            damageDealt = target.getProtection() - getPower();
        }
        
        target.setVitality(target.getVitality() - damageDealt);
    }
}

