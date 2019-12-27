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
 . The CharacterFactoryTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class CharacterFactoryTest {

    @Test
    public void createPersonnage() {
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.HUMAN, "Daniel", "bleu"), new Human("Daniel", "bleu"));
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.ORC, "Rag", 6f), new Orc("Rag", 6f));
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.TAUREN, "Adren", 10f), new Tauren("Adren", 10f));
        assertEquals(PersonnageFactory.createPersonnage(PersonnageType.TROLL, "Bloom", "Skoll"), new Troll("Bloom", "Skoll"));
    }
}