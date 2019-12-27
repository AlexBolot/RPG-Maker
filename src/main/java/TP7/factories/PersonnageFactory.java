package TP7.factories;

import TP7.entity.personnages.Character;
import TP7.entity.personnages.*;
import TP7.factories.types.PersonnageType;
import TP7.player.Player;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactory	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnageFactory {
    public static Character createPersonnage(PersonnageType personnageType, String name, Object argument) {
        if (name != null && !name.isEmpty() && argument != null) {
            switch (personnageType) {
                case HUMAN:
                    if (argument instanceof String) return new Human(name, (String) argument);
                    break;

                case TROLL:
                    if (argument instanceof String) return new Troll(name, (String) argument);
                    break;

                case ORC:
                    if (argument instanceof Float) return new Orc(name, (Float) argument);
                    break;

                case TAUREN:
                    if (argument instanceof Float) return new Tauren(name, (Float) argument);
                    break;
            }
        }
        return null;
    }

    public static Character createPersonnage(PersonnageType personnageType, String name, Object argument, Player player) {
        if (name != null && !name.isEmpty() && argument != null) {
            switch (personnageType) {
                case HUMAN:
                    if (argument instanceof String) {
                        Human human = new Human(name, (String) argument);

                        player.pay(human.getPrice());
                        return human;
                    }
                    break;

                case TROLL:
                    if (argument instanceof String) {
                        Troll troll = new Troll(name, (String) argument);

                        player.pay(troll.getPrice());
                        return troll;
                    }
                    break;

                case ORC:
                    if (argument instanceof Float) {
                        Orc orc = new Orc(name, (Float) argument);

                        player.pay(orc.getPrice());
                        return orc;
                    }
                    break;

                case TAUREN:
                    if (argument instanceof Float) {
                        Tauren tauren = new Tauren(name, (Float) argument);

                        player.pay(tauren.getPrice());
                        return tauren;
                    }
                    break;
            }
        }
        return null;
    }
}
