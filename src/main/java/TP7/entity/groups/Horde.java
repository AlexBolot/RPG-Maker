package TP7.entity.groups;

import TP7.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Horde	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "unused"})
public class Horde extends Group
{
    private ArrayList<Entity> entities = new ArrayList<>();
    
    public Horde (String name)
    {
        setName(name);
    }
    
    public Horde (Horde horde)
    {
        setName(horde.getName());
        getSoldiers().addAll(horde.getSoldiers());
    }
    
    //region Getters and Setters
    public ArrayList<Entity> getSoldiers ()
    {
        return entities;
    }
    
    public void addSoldiers (Entity... entities)
    {
        Collections.addAll(getSoldiers(), entities);
    }
    
    @Override
    public float getPower ()
    {
        float hordePower = 0;
        
        for (Entity e : getSoldiers())
        {
            hordePower += e.getPower();
        }
        
        return hordePower * 0.75f;
    }
    
    @Override
    public float getProtection ()
    {
        float hordeProtection = 0;
        
        for (Entity e : getSoldiers())
        {
            hordeProtection += e.getProtection();
        }
        
        return hordeProtection * 0.75f;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        String soldiersList = "";
        for (Entity e : getSoldiers())
        {
            soldiersList += "\t\t" + e;
        }
        
        String className = this.getClass().toString().substring(17);
        return className + " :\n\tSoldiers :\n" + soldiersList;
    }
}
