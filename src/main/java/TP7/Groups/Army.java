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
 . Last Modified : 31/01/17 00:55
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"unused", "WeakerAccess", "UnnecessaryLocalVariable", "unchecked"})
public class Army extends Group
{
    private ArrayList<Personnage> generals   = new ArrayList<>();
    private ArrayList<Battalion>  battalions = new ArrayList<>();
    
    public Army (Personnage general)
    {
        addGeneral(general);
    }
    
    public Army (Battalion battalion)
    {
        addBattalion(battalion);
    }
    
    public Army (ArrayList<?> generalsOrBattalions)
    {
        ArrayList<?> param = generalsOrBattalions;
        if(param != null && param.size() > 0)
        {
            if(param.get(0) instanceof Personnage)
            {
                addGeneral((ArrayList<Personnage>) param);
            }
            else if(param.get(0) instanceof Battalion)
            {
                addBattalion((ArrayList<Battalion>) param);
            }
        }
    }
    
    public Army (Personnage general, Battalion battalion)
    {
        addGeneral(general);
        addBattalion(battalion);
    }
    
    public Army (ArrayList<Personnage> generals, ArrayList<Battalion> battalions)
    {
        addGeneral(generals);
        addBattalion(battalions);
    }
    
    public Army (Army army)
    {
        getBattalions().addAll(army.getBattalions());
        getGenerals().addAll(army.getGenerals());
    }
    
    //region Getters and Setters
    public ArrayList<Personnage> getGenerals ()
    {
        return generals;
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
    
    public void addGeneral (Personnage general)
    {
        getGenerals().add(general);
    }
    
    public void addGeneral (ArrayList<Personnage> generals)
    {
        getGenerals().addAll(generals);
    }
    
    @Override
    public float getPower ()
    {
        float armyPower = 0;
        
        for (Battalion battalion : getBattalions())
        {
            armyPower += battalion.getPower();
        }
        
        for (Personnage general : getGenerals())
        {
            armyPower += general.getPower();
        }
        
        return armyPower;
    }
    
    @Override
    public float getProtection ()
    {
        float armyProtection = 0;
        
        for (Battalion battalion : getBattalions())
        {
            armyProtection += battalion.getProtection();
        }
        
        for (Personnage general : getGenerals())
        {
            armyProtection += general.getProtection();
        }
        
        return armyProtection;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        //region String generalsList = "";
        String generalsList = "";
        for (Personnage general : getGenerals())
        {
            generalsList += "\t\t" + general;
        }
        //endregion
        
        //region String battalionsList = "";
        String battalionsList = "";
        for (Battalion battalion : getBattalions())
        {
            battalionsList += "\t\t" + battalion;
        }
        //endregion
        
        String className = this.getClass().toString().substring(17);
        return className + " :\n\tGenerals :\n" + generalsList + "\n\tBattalions :\n" + battalionsList;
    }
}
