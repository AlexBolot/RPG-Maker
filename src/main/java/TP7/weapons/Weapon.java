package TP7.weapons;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Weapon	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 04/10/17 00:55
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 <h2>Abstract class representing a weapon</h2>

 <h3>Attributes :</h3>
 —> <i>power</i> : Attack power of the weapon<br>
 —> <i>protection</i> : Defense power of the weapon<br>

 <h3>Noticable methods :</h3>
 There are no interesting methods<br>
 The Weapon class is only used to store data
 */
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