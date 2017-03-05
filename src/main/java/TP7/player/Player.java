package TP7.player;


import TP7.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Player	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "unused"})
public class Player
{
    private String name;
    private float  moneyCount;
    private ArrayList<Entity> entities = new ArrayList<>();
    
    public Player (String name, float moneyCount)
    {
        this.name = name;
        this.moneyCount = moneyCount;
    }
    
    public Player (Player player)
    {
        this.name = player.getName();
        this.moneyCount = player.getMoneyCount();
        this.entities = player.getEntities();
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
    
    public ArrayList<Entity> getEntities ()
    {
        return entities;
    }
    
    //endregion
    
    public void addEntities (Entity... entities)
    {
        Collections.addAll(getEntities(), entities);
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if(obj == null) return false;
        if(!(obj instanceof Player)) return false;
        
        Player playerCompare = (Player) obj;
        
        return name.equalsIgnoreCase(playerCompare.getName());
    }
}