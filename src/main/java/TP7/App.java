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
 . Last Modified : 10/02/17 17:44
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class App
{
    public static void main (String[] args)
    {
        Battalion battalion1 = new Battalion("battalion1", PersonnageType.HUMAN, 2, "Bleu");
        Battalion battalion2 = new Battalion("battalion1", PersonnageType.TROLL, 1, "1664");
        Battalion battalion3 = new Battalion("battalion1", PersonnageType.TAUREN, 3, 4.5f);
    
        Personnage general1 = new Human("Napoleon", "Marron");
    
        ArrayList<Battalion> battalions = new ArrayList<>();
        battalions.add(battalion1);
        battalions.add(battalion2);
        battalions.add(battalion3);
    
        Army army = new Army("General1", general1);
        army.addBattalion(battalions);
    
        System.out.println(army);
    }
}
