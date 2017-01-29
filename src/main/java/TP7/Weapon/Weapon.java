package TP7.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Weapon	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 01:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class Weapon
{
    protected float power;
    protected float protection;
    
    //region Getters and Setters
    public float getPower ()
    {
        return power;
    }
    
    public void setPower (float power)
    {
        this.power = power;
    }
    
    public float getProtection ()
    {
        return protection;
    }
    
    public void setProtection (float protection)
    {
        this.protection = protection;
    }
    //endregion
}