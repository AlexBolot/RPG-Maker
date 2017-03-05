package TP7.entity.personnages;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The TaurenTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class TaurenTest
{
    private final float  hornSize = generateHornSize();
    private       Tauren tauren   = new Tauren("Powaeesha", hornSize);
    
    private float generateHornSize ()
    {
        //We set the HornSize random between 200mm and 700mm
        int randInt = ThreadLocalRandom.current().nextInt(200, 700);
        return randInt / 100;
    }
    
    @Test   //Test if the HornSize is hornSize. => True
    public void getHornSize1 () throws Exception
    {
        assertEquals(hornSize, tauren.getHornSize(), 0.001);
    }
    
    @Test   //Test if the HornSize is (hornSize - 1). => False
    public void getHornSize2 () throws Exception
    {
        assertNotEquals(hornSize - 1, tauren.getHornSize(), 0.001);
    }
    
    @Test
    public void ToString () throws Exception
    {
        assertEquals("Tauren : \tPowaeesha\tweapons : \t{RIGHT=Shield : power = 5.0, protection = 20.0}\tHornSize : \t" + hornSize + "\n",
                     tauren.toString());
    }
}