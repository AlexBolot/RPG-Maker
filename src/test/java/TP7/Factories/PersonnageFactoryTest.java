package TP7.Factories;

import TP7.Entity.Personnages.Human;
import TP7.Entity.Personnages.Orc;
import TP7.Entity.Personnages.Tauren;
import TP7.Entity.Personnages.Troll;
import TP7.Factories.Types.PersonnageType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;




/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactoryTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 11/02/17 00:48
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
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.ORC, "Rag", 6f), new Orc("Rag", 6f));
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.TAUREN, "Adren", 10f), new Tauren("Adren", 10f));
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.TROLL, "Bloom", "Skoll"),new Troll("Bloom", "Skoll"));
    }

    
}