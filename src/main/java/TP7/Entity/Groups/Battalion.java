package TP7.Entity.Groups;

import TP7.Entity.Entity;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Battalion	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:48
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
