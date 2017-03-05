package TP7.factories;

import TP7.entity.personnages.Human;
import TP7.entity.personnages.Orc;
import TP7.entity.personnages.Tauren;
import TP7.entity.personnages.Troll;
import TP7.factories.types.PersonnageType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;




/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactoryTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
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