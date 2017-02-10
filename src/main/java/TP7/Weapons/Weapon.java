package TP7.Weapons;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Weapon	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:12
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("WeakerAccess")
public abstract class Weapon
{
    private float power;
    private float protection;
    
    //region Getters and Setters
    public float getPower ()
    {
        return power;
    }
    
    protected void setPower (float power)
    {
        this.power = power;
    }
    
    public float getProtection ()
    {
        return protection;
    }
    
    protected void setProtection (float protection)
    {
        this.protection = protection;
    }
    //endregion
    
    @Override
    public String toString ()
    {
        String className = this.getClass().toString().substring(18);
        return className + " : power = " + getPower() + ", protection = " + getProtection();
    }
}