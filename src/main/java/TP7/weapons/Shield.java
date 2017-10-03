package TP7.weapons;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Shield	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 04/10/17 00:55
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 <h2>Class representing a shield</h2>

 <h3>Attributes :</h3>
 —> The attributes are inherited<br>
 —> See the {@link Weapon Weapon} class

 <h3>Constructor :</h3>
 —> The constructor has no parameters<br>
 —> It sets [power] = 5 and [protection] = 20
 */
public class Shield extends Weapon
{
    /**
     <h3>Default constructor :</h3>
     —> sets [power] = 5<br>
     —> sets [protection] = 20
     */
    public Shield ()
    {
        setPower(5);
        setProtection(20);
    }
}