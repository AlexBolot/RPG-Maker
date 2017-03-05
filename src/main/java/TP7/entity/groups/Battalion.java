package TP7.entity.groups;

import TP7.entity.Entity;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Battalion	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("unused")
public class Battalion extends Horde
{
    public Battalion (String name)
    {
        super(name);
    }
    
    public Battalion (Horde horde)
    {
        super(horde);
    }
    //region Getters and Setters
    @Override
    public float getPower ()
    {
        float hordePower = 0;
    
        for (Entity e : getSoldiers())
        {
            hordePower += e.getPower();
        }
        
        return hordePower * 1.5f;
    }
    
    @Override
    public float getProtection ()
    {
        float hordeProtection = 0;
    
        for (Entity e : getSoldiers())
        {
            hordeProtection += e.getProtection();
        }
    
        return hordeProtection * 1.5f;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return super.toString();
    }
}
