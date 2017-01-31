package TP7.Personnages;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The OrcTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 00:59
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class OrcTest
{
    private final float earSize = generateEarSize();
    private       Orc   orc     = new Orc("Thrugal", earSize);
    
    private float generateEarSize ()
    {
        //We set the EarSize random between 200mm and 700mm
        int randInt = ThreadLocalRandom.current().nextInt(200, 700);
        return randInt / 100;
    }
    
    @Test   //Test if the EarSize is earSize. => True
    public void getEarSize1 () throws Exception
    {
        assertEquals(earSize, orc.getEarSize(), 0.001);
    }
    
    @Test   //Test if the EarSize is (earSize - 1). => False
    public void getEarSize2 () throws Exception
    {
        assertNotEquals(earSize - 1, orc.getEarSize(), 0.001);
    }
    
    @Test
    public void ToString () throws Exception
    {
        assertEquals("Orc : \tThrugal\tWeapons : \t[word : power = 25.0, protection = 5.0]\tEarSize : \t" + earSize + "\n",
                     orc.toString());
    }
}