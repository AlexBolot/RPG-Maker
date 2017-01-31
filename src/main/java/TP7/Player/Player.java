package TP7.Player;

import TP7.Groups.Army;
import TP7.Groups.Battalion;
import TP7.Groups.Horde;
import TP7.Personnages.Personnage;

import java.util.ArrayList;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Player	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 15:51
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "unused"})
public class Player
{
    private String name;
    private float  moneyCount;
    private ArrayList<Personnage> personnages = new ArrayList<>();
    private ArrayList<Horde>      hordes      = new ArrayList<>();
    private ArrayList<Battalion>  battalions  = new ArrayList<>();
    private ArrayList<Army>       armies      = new ArrayList<>();
    
    public Player (String name, float moneyCount)
    {
        this.name = name;
        this.moneyCount = moneyCount;
    }
    
    public Player (Player player)
    {
        this.name = player.getName();
        this.moneyCount = player.getMoneyCount();
        this.personnages = player.getPersonnages();
        this.hordes = player.getHordes();
        this.battalions = player.getBattalions();
        this.armies = player.getArmies();
    }
    
    //region Getters and Setters
    public String getName ()
    {
        return name;
    }
    
    private void setName (String name)
    {
        this.name = name;
    }
    
    public float getMoneyCount ()
    {
        return moneyCount;
    }
    
    public void pay (float price)
    {
        this.moneyCount -= price;
    }
    
    public ArrayList<Personnage> getPersonnages ()
    {
        return personnages;
    }
    
    public ArrayList<Horde> getHordes ()
    {
        return hordes;
    }
    
    public ArrayList<Battalion> getBattalions ()
    {
        return battalions;
    }
    
    public ArrayList<Army> getArmies ()
    {
        return armies;
    }
    
    public void addPersonnage (Personnage personnages)
    {
        getPersonnages().add(personnages);
    }
    
    public void addPersonnage (ArrayList<Personnage> personnages)
    {
        getPersonnages().addAll(personnages);
    }
    
    public void addHorde (Horde hordes)
    {
        getHordes().add(hordes);
    }
    
    public void addHorde (ArrayList<Horde> hordes)
    {
        getHordes().addAll(hordes);
    }
    
    public void addBattalion (Battalion battalions)
    {
        getBattalions().add(battalions);
    }
    
    public void addBattalion (ArrayList<Battalion> battalions)
    {
        getBattalions().addAll(battalions);
    }
    
    public void addArmy (Army armies)
    {
        getArmies().add(armies);
    }
    
    public void addArmy (ArrayList<Army> armies)
    {
        getArmies().addAll(armies);
    }
    //endregion
    
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Player)) return false;
        
        Player playerCompare = (Player) obj;
        
        return name.equalsIgnoreCase(playerCompare.getName());
    }
}