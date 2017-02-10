package TP7.Entity.Groups;

import TP7.Entity.Entity;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Group	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:32
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class Group extends Entity
{
    private String name;
    
    public String getName ()
    {
        return name;
    }
    
    protected void setName (String name)
    {
        this.name = name;
    }
    
    public abstract float getPower ();
    
    public abstract float getProtection ();
    
    public abstract String toString ();
}
