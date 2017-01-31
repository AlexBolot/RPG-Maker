package TP7.Factories;

import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.*;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactory	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 30/01/17 22:05
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnageFactory
{
    public Personnage createPersonnage (PersonnageType personnageType, String name, String argument)
    {
        if(name != null && !name.isEmpty() && argument != null)
        {
            switch (personnageType)
            {
                case HUMAN:
                    return new Human(name, argument);
                
                case TROLL:
                    return new Troll(name, argument);
            }
        }
        return null;
    }
    
    public Personnage createPersonnage (PersonnageType personnageType, String name, float argument)
    {
        if(name != null && !name.isEmpty())
        {
            switch (personnageType)
            {
                case ORC:
                    return new Orc(name, argument);
                
                case TAUREN:
                    return new Tauren(name, argument);
            }
        }
        return null;
    }
}
