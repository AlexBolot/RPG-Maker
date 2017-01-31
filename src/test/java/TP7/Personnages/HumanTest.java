package TP7.Personnages;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The HumanTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 15:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class HumanTest
{
    private Human human = new Human("Radcliffe", "Bleu");
    
    @Test   //Test if the EyeColor is Bleu. => True
    public void getEyeColor1 () throws Exception
    {
        assertEquals("Bleu", human.getEyeColor());
    }
    
    @Test   //Test if the EyeColor is Marron. => False
    public void getEyeColor2 () throws Exception
    {
        assertNotEquals("Marron", human.getEyeColor());
    }
    
    @Test
    public void ToString () throws Exception
    {
        assertEquals("Human : \tRadcliffe\tWeapons : \t[Sword : power = 25.0, protection = 5.0]\tEyeColor : \tBleu\n",
                     human.toString());
    }
}