package TP7.Factories;

import TP7.Factories.Types.PersonnageType;
import TP7.Personnages.Personnage;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PersonnageFactory	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 10/02/17 17:44
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PersonnageFactory
{
    public static Personnage createPersonnage(PersonnageType personnageType, String name, Object argument)
    {
        /*if(name != null && !name.isEmpty() && argument != null)
        {
            switch (personnageType)
            {
                case HUMAN:
                    return new Human(name, argument);
                
                case TROLL:
                    return new Troll(name, argument);
            }
        }*/
        return null;
    }
    
    public Personnage createPersonnage (PersonnageType personnageType, String name, float argument)
    {
        /*if(name != null && !name.isEmpty())
        {
            switch (personnageType)
            {
                case ORC:
                    return new Orc(name, argument);
                
                case TAUREN:
                    return new Tauren(name, argument);
            }
        }*/
        return null;
    }
}
