package TP7;

import TP7.Factories.Types.PersonnageType;
import TP7.Groups.Army;
import TP7.Groups.Battalion;
import TP7.Personnages.Human;
import TP7.Personnages.Personnage;

import java.util.ArrayList;

/*................................................................................................................................
 . Copyright (c)
 .
 . The App	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 31/01/17 01:07
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class App
{
    public static void main (String[] args)
    {
        Battalion battalion1 = new Battalion(PersonnageType.HUMAN, 2, "Bleu");
        Battalion battalion2 = new Battalion(PersonnageType.TROLL, 1, "1664");
        Battalion battalion3 = new Battalion(PersonnageType.TAUREN, 3, 4.5f);
    
        Personnage general1 = new Human("Napoleon", "Marron");
    
        ArrayList<Battalion> battalions = new ArrayList<>();
        battalions.add(battalion1);
        battalions.add(battalion2);
        battalions.add(battalion3);
    
        Army army = new Army(battalions);
        army.addGeneral(general1);
    
        System.out.println(army);
    }
}
