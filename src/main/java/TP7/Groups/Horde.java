package TP7.Groups;

import TP7.Factories.PersonnageFactory;
import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.Personnage;

import java.util.ArrayList;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Horde	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 15:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "unused"})
public class Horde extends Group
{
    private ArrayList<Personnage> soldiers = new ArrayList<>();
    
    public Horde (String name, Personnage personnage)
    {
        setName(name);
        getSoldiers().add(personnage);
    }
    
    public Horde (String name, PersonnageType type, int amount, String argument)
    {
        setName(name);
        for (int i = 0; i < amount; i++)
        {
            addSoldier(new PersonnageFactory().createPersonnage(type, type.toString().toLowerCase() + i, argument));
        }
    }
    
    public Horde (String name, PersonnageType type, int amount, float argument)
    {
        setName(name);
        for (int i = 0; i < amount; i++)
        {
            addSoldier(new PersonnageFactory().createPersonnage(type, type.toString().toLowerCase() + i, argument));
        }
    }
    
    public Horde (Horde horde)
    {
        setName(horde.getName());
        getSoldiers().addAll(horde.getSoldiers());
    }
    
    //region Getters and Setters
    public ArrayList<Personnage> getSoldiers ()
    {
        return soldiers;
    }
    
    public void addSoldier (Personnage personnage)
    {
        getSoldiers().add(personnage);
    }
    
    public void addSoldier (Horde horde)
    {
        getSoldiers().addAll(horde.getSoldiers());
    }
    
    @Override
    public float getPower ()
    {
        float hordePower = 0;
        
        for (Personnage p : getSoldiers())
        {
            hordePower += p.getPower();
        }
        
        return hordePower * 0.75f;
    }
    
    @Override
    public float getProtection ()
    {
        float hordeProtection = 0;
        
        for (Personnage p : getSoldiers())
        {
            hordeProtection += p.getProtection();
        }
        
        return hordeProtection * 0.75f;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        String soldiersList = "";
        for (Personnage p : getSoldiers())
        {
            soldiersList += "\t\t" + p;
        }
        
        String className = this.getClass().toString().substring(17);
        return className + " :\n\tSoldiers :\n" + soldiersList;
    }
}
