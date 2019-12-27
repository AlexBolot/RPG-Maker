package TP7.entity.groups;

import TP7.entity.personnages.Human;
import TP7.factories.GroupFactory;
import TP7.player.Player;
import org.junit.Test;

import static TP7.factories.types.GroupType.BATTALION;
import static TP7.factories.types.PersonnageType.ORC;
import static TP7.factories.types.PersonnageType.TAUREN;
import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The ArmyTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class ArmyTest {
    private Army army = new Army("army", new Human("general1", "bleu"));

    @Test
    public void getGeneral() {
        assertEquals(new Human("general1", "bleu"), army.getGeneral());
    }

    @Test
    public void getBattalions() {
        Player player = new Player("player1", 5000);

        TP7.entity.groups.Group g1 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.entity.groups.Group g2 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.entity.groups.Group g3 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);

        army.addBattalion((Battalion) g1, (Battalion) g2, (Battalion) g3);

        assertEquals(3, army.getBattalions().size());
    }

    @Test
    public void addBattalion() {
        Player player = new Player("player1", 5000);

        TP7.entity.groups.Group g1 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.entity.groups.Group g2 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        TP7.entity.groups.Group g3 = GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);

        army.addBattalion((Battalion) g1, (Battalion) g2, (Battalion) g3);

        assertEquals(3, army.getBattalions().size());
    }


    @Test
    public void getPower() {
        Player player = new Player("player1", 5000);

        Battalion b1 = (Battalion) GroupFactory.creatGroup(BATTALION, "group1", ORC, 5, 10.4f, player);
        Battalion b2 = (Battalion) GroupFactory.creatGroup(BATTALION, "group1", TAUREN, 5, 10.4f, player);
        Battalion b3 = (Battalion) GroupFactory.creatGroup(BATTALION, "group1", ORC, 5, 10.4f, player);

        army.addBattalion(b1, b2, b3);

        assertEquals(437.5f, army.getPower(), 0.001f);
    }
}