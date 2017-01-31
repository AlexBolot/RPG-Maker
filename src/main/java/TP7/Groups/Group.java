package TP7.Groups;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Group	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 15:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class Group
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
