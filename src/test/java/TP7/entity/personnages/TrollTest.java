package TP7.entity.personnages;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The TrollTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class TrollTest
{
    private Troll troll = new Troll("Thrugal", "Kwak");
    
    @Test   //Test if the FavoriteBeer is Bleu. => True
    public void getFavoriteBeer1 () throws Exception
    {
        assertEquals("Kwak", troll.getFavoriteBeer());
    }
    
    @Test   //Test if the FavoriteBeer is Marron. => False
    public void getFavoriteBeer2 () throws Exception
    {
        assertNotEquals("1664", troll.getFavoriteBeer());
    }
    
    @Test
    public void ToString () throws Exception
    {
        assertEquals(
                "Troll : \tThrugal\tweapons : \t{RIGHT=Dager : power = 20.0, protection = 10.0}\tFavoriteBeer : \tKwak\n",
                troll.toString());
    }
}