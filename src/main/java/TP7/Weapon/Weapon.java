package TP7.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Weapon	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 16:21
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
        String className = this.getClass().toString().substring(17);
        return className + " : power = " + getPower() + ", protection = " + getProtection();
    }
}