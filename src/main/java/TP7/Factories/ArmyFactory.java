package TP7.Factories;

import TP7.Factories.Types.GroupType;
import TP7.Factories.Types.PersonnageType;
import TP7.Groups.Army;
import TP7.Groups.Battalion;
import TP7.Groups.Group;
import TP7.Groups.Horde;
import TP7.Personnages.Personnage;
import TP7.Player.Player;

/*................................................................................................................................
 . Copyright (c)
 .
 . The ArmyFactory	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 15:21
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings("unused")
public class ArmyFactory
{
    public Personnage create (PersonnageType type, String name, String argument, Player owner)
    {
        switch (type)
        {
            //region case HUMAN:
            case HUMAN:
                float humanPrice = getUnitPrice(type);
                if(owner.getMoneyCount() >= humanPrice)
                {
                    owner.pay(humanPrice);
                    return new PersonnageFactory().createPersonnage(type, name, argument);
                }
                break;
            //endregion
            
            //region case TROLL:
            case TROLL:
                float trollPrice = getUnitPrice(type);
                if(owner.getMoneyCount() >= trollPrice)
                {
                    owner.pay(trollPrice);
                    return new PersonnageFactory().createPersonnage(type, name, argument);
                }
                break;
            //endregion
        }
        return null;
    }
    
    public Personnage create (PersonnageType type, String name, float argument, Player owner)
    {
        switch (type)
        {
            //region case ORC:
            case ORC:
                float orcPrice = getUnitPrice(type);
                if(owner.getMoneyCount() >= orcPrice)
                {
                    owner.pay(orcPrice);
                    return new PersonnageFactory().createPersonnage(type, name, argument);
                }
                break;
            //endregion
            
            //region case TAUREN:
            case TAUREN:
                float taurenPrice = getUnitPrice(type);
                if(owner.getMoneyCount() >= taurenPrice)
                {
                    owner.pay(taurenPrice);
                    return new PersonnageFactory().createPersonnage(type, name, argument);
                }
                break;
            //endregion
        }
        return null;
    }
    
    public Group creatGroup (GroupType groupType, String name, PersonnageType type, int amount, String argument, Player owner)
    {
        switch (groupType)
        {
            //region case HORDE:
            case HORDE:
                float hordePrice = amount * 0.75f * getUnitPrice(type);
                if(owner.getMoneyCount() >= hordePrice)
                {
                    owner.pay(hordePrice);
                    return new Horde(name, type, amount, argument);
                }
                break;
            //endregion
            
            //region case BATTALION:
            case BATTALION:
                float battalionPrice = amount * getUnitPrice(type);
                if(owner.getMoneyCount() >= battalionPrice)
                {
                    owner.pay(battalionPrice);
                    return new Battalion(name, type, amount, argument);
                }
                break;
            //endregion
        }
        return null;
    }
    
    public Group creatGroup (GroupType groupType, String name, PersonnageType type, int amount, float argument, Player owner)
    {
        switch (groupType)
        {
            //region case HORDE:
            case HORDE:
                float hordePrice = amount * 0.75f * getUnitPrice(type);
                if(owner.getMoneyCount() >= hordePrice)
                {
                    owner.pay(hordePrice);
                    return new Horde(name, type, amount, argument);
                }
                break;
            //endregion
            
            //region case BATTALION:
            case BATTALION:
                float battalionPrice = amount * getUnitPrice(type);
                if(owner.getMoneyCount() >= battalionPrice)
                {
                    owner.pay(battalionPrice);
                    return new Battalion(name, type, amount, argument);
                }
                break;
            //endregion
        }
        return null;
    }
    
    public Group creatGroup (GroupType groupType, String name, PersonnageType type, String argument, Player owner)
    {
        switch (groupType)
        {
            case ARMY:
                float armyPrice = getUnitPrice(type) * 1.2f;
                if(owner.getMoneyCount() >= armyPrice)
                {
                    String generalName = "General-" + type.toString().toLowerCase();
                    Personnage general = new PersonnageFactory().createPersonnage(type, generalName, argument);
                    return new Army(name, general);
                }
                break;
        }
        return null;
    }
    
    public Group creatGroup (GroupType groupType, String name, PersonnageType type, float argument, Player owner)
    {
        switch (groupType)
        {
            case ARMY:
                float armyPrice = getUnitPrice(type) * 1.2f;
                if(owner.getMoneyCount() >= armyPrice)
                {
                    String generalName = "General-" + type.toString().toLowerCase();
                    Personnage general = new PersonnageFactory().createPersonnage(type, generalName, argument);
                    return new Army(name, general);
                }
                break;
        }
        return null;
    }
    
    private float getUnitPrice (PersonnageType type)
    {
        switch (type)
        {
            case HUMAN:
                return 10;
            case ORC:
                return 10;
            case TAUREN:
                return 2;
            case TROLL:
                return 5;
        }
        return 0;
    }
}
