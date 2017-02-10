package TP7.Factories;

import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.Human;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactoryTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 10/02/17 17:32
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnageFactoryTest
{
    //TODO
    
    @Test
    public void createPersonnage () throws Exception
    {

        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.HUMAN, "Daniel", "bleu"),new Human("Daniel", "bleu"));
    }
    
    @Test
    public void createPersonnage1 () throws Exception
    {
        
    }
    
}