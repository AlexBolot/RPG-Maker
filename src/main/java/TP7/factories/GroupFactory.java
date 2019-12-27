package TP7.factories;

import TP7.entity.groups.Army;
import TP7.entity.groups.Battalion;
import TP7.entity.groups.Group;
import TP7.entity.groups.Horde;
import TP7.entity.personnages.Human;
import TP7.entity.personnages.Orc;
import TP7.entity.personnages.Tauren;
import TP7.entity.personnages.Troll;
import TP7.factories.types.GroupType;
import TP7.factories.types.PersonnageType;
import TP7.player.Player;

/*................................................................................................................................
 . Copyright (c)
 .
 . The GroupFactory	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class GroupFactory {
    public static Army createArmy(String armyName, PersonnageType generalType, String generalName, Object argument, Player player) {
        float generalPice = getUnitPrice(generalType) * 1.2f;

        if (player.getMoneyCount() >= generalPice) {
            player.pay(generalPice);
            return new Army(armyName, PersonnageFactory.createPersonnage(generalType, generalName, argument));
        }

        return null;
    }

    public static Group creatGroup(GroupType groupType, String name, PersonnageType type, int amount, Object argument, Player owner) {
        switch (groupType) {
            //region case HORDE:
            case HORDE:
                float hordePrice = amount * 0.75f * getUnitPrice(type);
                if (owner.getMoneyCount() >= hordePrice) {
                    owner.pay(hordePrice);
                    Horde horde = new Horde(name);

                    for (int i = 1; i <= amount; i++) {
                        horde.addSoldiers(PersonnageFactory.createPersonnage(type, type.toString() + i, argument));
                    }
                    return horde;
                }
                break;
            //endregion

            //region case BATTALION:
            case BATTALION:
                float battalionPrice = amount * getUnitPrice(type);
                if (owner.getMoneyCount() >= battalionPrice) {
                    owner.pay(battalionPrice);
                    Battalion battalion = new Battalion(name);

                    for (int i = 1; i <= amount; i++) {
                        battalion.addSoldiers(PersonnageFactory.createPersonnage(type, type.toString() + i, argument));
                    }
                    return battalion;
                }
                break;
            //endregion
        }
        return null;
    }

    private static float getUnitPrice(PersonnageType type) {
        switch (type) {
            case HUMAN:
                return new Human("", "").getPrice();
            case ORC:
                return new Orc("", 0).getPrice();
            case TAUREN:
                return new Tauren("", 0).getPrice();
            case TROLL:
                return new Troll("", "").getPrice();
        }
        return 0;
    }
}
