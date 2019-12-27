package TP7.entity.personnages;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The HumanTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class HumanTest {
    private Human human = new Human("Radcliffe", "Bleu");

    @Test   //Test if the EyeColor is Bleu. => True
    public void getEyeColor1() {
        assertEquals("Bleu", human.getEyeColor());
    }

    @Test   //Test if the EyeColor is Marron. => False
    public void getEyeColor2() {
        assertNotEquals("Marron", human.getEyeColor());
    }

    @Test
    public void ToString() {
        assertEquals(
                "Human : \tRadcliffe\tweapons : \t{RIGHT=Sword : power = 25.0, protection = 5.0}\tEyeColor : \tBleu\n",
                human.toString());
    }
}