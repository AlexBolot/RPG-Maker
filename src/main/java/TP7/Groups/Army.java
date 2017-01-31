package TP7.Groups;

import TP7.Personnages.Personnage;

import java.util.ArrayList;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Army	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 01:19
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "unused"})
public class Army extends Group
{
    private Personnage general;
    private ArrayList<Battalion> battalions = new ArrayList<>();
    
    public Army (Personnage general)
    {
        this.general = general;
    }
    
    public Army (Army army)
    {
        getBattalions().addAll(army.getBattalions());
    }
    
    //region Getters and Setters
    public Personnage getGeneral ()
    {
        return general;
    }
    
    public ArrayList<Battalion> getBattalions ()
    {
        return battalions;
    }
    
    public void addBattalion (Battalion battalion)
    {
        getBattalions().add(battalion);
    }
    
    public void addBattalion (ArrayList<Battalion> battalions)
    {
        getBattalions().addAll(battalions);
    }
    
    @Override
    public float getPower ()
    {
        float armyPower = getGeneral().getPower();
        
        for (Battalion battalion : getBattalions())
        {
            armyPower += battalion.getPower();
        }
        
        return armyPower;
    }
    
    @Override
    public float getProtection ()
    {
        float armyProtection = getGeneral().getProtection();
        
        for (Battalion battalion : getBattalions())
        {
            armyProtection += battalion.getProtection();
        }
        
        return armyProtection;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        String battalionsList = "";
        for (Battalion battalion : getBattalions())
        {
            battalionsList += "\t\t" + battalion;
        }
        
        String className = this.getClass().toString().substring(17);
        return className + " :\n\tGenerals :\n\t\t" + general + "\n\tBattalions :\n" + battalionsList;
    }
}
