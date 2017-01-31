package TP7.Groups;

import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.Personnage;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Battalion	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 15:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("unused")
public class Battalion extends Horde
{
    public Battalion (String name, Personnage personnage)
    {
        super(name, personnage);
    }
    
    public Battalion (String name, PersonnageType type, int amount, String argument)
    {
        super(name, type, amount, argument);
    }
    
    public Battalion (String name, PersonnageType type, int amount, float argument)
    {
        super(name, type, amount, argument);
    }
    
    public Battalion (String name, Battalion battalion)
    {
        super(battalion);
    }
    
    public Battalion (String name, Horde horde)
    {
        super(horde);
    }
    
    //region Getters and Setters
    @Override
    public float getPower ()
    {
        float hordePower = 0;
        
        for (Personnage p : getSoldiers())
        {
            hordePower += p.getPower();
        }
        
        return hordePower * 1.5f;
    }
    
    @Override
    public float getProtection ()
    {
        float hordeProtection = 0;
        
        for (Personnage p : getSoldiers())
        {
            hordeProtection += p.getProtection();
        }
        
        return hordeProtection * 1.55f;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        return super.toString();
    }
}
