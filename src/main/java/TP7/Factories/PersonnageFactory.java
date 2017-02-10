package TP7.Factories;

import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.*;
import TP7.Player.Player;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactory	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 10/02/17 18:05
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnageFactory
{
    public static Personnage createPersonnage (PersonnageType personnageType, String name, Object argument)
    {
        if(name != null && !name.isEmpty() && argument != null)
        {
            switch (personnageType)
            {
                //region HUMAN
                case HUMAN:
                    if(argument instanceof String) return new Human(name, (String) argument);
                    break;
                //endregion
    
                //region TROLL
                case TROLL:
                    if(argument instanceof String) return new Troll(name, (String) argument);
                    break;
                //endregion
    
                //region ORC
                case ORC:
                    if(argument instanceof Float) return new Orc(name, (Float) argument);
                    break;
                //endregion
    
                //region TAUREN
                case TAUREN:
                    if(argument instanceof Float) return new Tauren(name, (Float) argument);
                    break;
                //endregion
            }
        }
        return null;
    }
    
    public static Personnage createPersonnage (PersonnageType personnageType, String name, Object argument, Player player)
    {
        if(name != null && !name.isEmpty() && argument != null)
        {
            switch (personnageType)
            {
                //region HUMAN
                case HUMAN:
                    if(argument instanceof String)
                    {
                        Human newHuman = new Human(name, (String) argument);
                        player.pay(newHuman.getPrice());
                        return newHuman;
                    }
                    break;
                //endregion
    
                //region TROLL
                case TROLL:
                    if(argument instanceof String)
                    {
                        Troll newTroll = new Troll(name, (String) argument);
                        player.pay(newTroll.getPrice());
                        return newTroll;
                    }
                    break;
                //endregion
    
                //region ORC
                case ORC:
                    if(argument instanceof Float)
                    {
                        Orc newOrc = new Orc(name, (Float) argument);
                        player.pay(newOrc.getPrice());
                        return newOrc;
                    }
                    break;
                //endregion
    
                //region TAUREN
                case TAUREN:
                    if(argument instanceof Float)
                    {
                        Tauren newTauren = new Tauren(name, (Float) argument);
                        player.pay(newTauren.getPrice());
                        return newTauren;
                    }
                    break;
                //endregion
            }
        }
        return null;
    }
}
