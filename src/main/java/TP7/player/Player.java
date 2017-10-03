package TP7.player;

import TP7.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Player	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 03/10/17 23:44
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 <h2>Class representing a player of the game.</h2>

 <h3>Attributes :</h3>
 —> <i>name</i> : Name of the player.<br>
 —> <i>moneyCount</i> : Money of the player, used to buy entities.<br>
 —> <i>entities</i> : List of entities bought by the player.<br>

 <h3>Noticable methods :</h3>
 —> <i>pay (float price)</i> : reduces [moneyCount].<br>
 —> <i>addEntities (Entity... entities)</i> : adds a list of entities to the existing list.
 */
@SuppressWarnings ("All")
public class Player
{
    private String name;
    private float  moneyCount;
    private ArrayList<Entity> entities = new ArrayList<>();

    /**
     <h3>Default constructor with name and moneyCount.</h3>

     @param name       Name of the player.
     @param moneyCount Amount of money owned by the player.
     */
    public Player (String name, float moneyCount)
    {
        this.name = name;
        this.moneyCount = moneyCount;
    }

    /**
     <h3>Alternative constructor, using another Player as data.</h3>

     @param player The Player to be copied.
     */
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

    /**
     <h3>Reduces the [moneyCount].</h3>

     @param price The amount to substract to [moneyCount].
     */
    public void pay (float price)
    {
        this.moneyCount -= price;
    }

    public ArrayList<Entity> getEntities ()
    {
        return entities;
    }

    //endregion

    /**
     <h3>Adds a list of entities to the existing list.</h3>

     @param entities The list of entities to add to [entities].
     */
    public void addEntities (Entity... entities)
    {
        Collections.addAll(getEntities(), entities);
    }

    /**
     <h3>Compares this player with [obj], comparing the name of the players.</h3>

     @param obj Object (expected to be of class Player) to compare with this player.
     @return True if the name of both player is the same.
     */
    @Override
    public boolean equals (Object obj)
    {
        if (obj == null || !(obj instanceof Player)) return false;

        Player playerCompare = (Player) obj;

        return name.equalsIgnoreCase(playerCompare.getName());
    }

    @Override
    protected Object clone () throws CloneNotSupportedException
    {
        Player newPlayer = new Player(getName(), getMoneyCount());
        newPlayer.entities = (ArrayList<Entity>) getEntities().clone();

        return newPlayer;
    }
}