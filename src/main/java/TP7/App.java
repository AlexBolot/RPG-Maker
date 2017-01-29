package TP7;

import TP7.Improvement.Buff;
import TP7.Improvement.Enchant;
import TP7.Personnage.Orc;
import TP7.Personnage.Personnage;
import TP7.Personnage.Tauren;
import TP7.Weapon.Weapon;

/*................................................................................................................................
 . Copyright (c)
 .
 . The App	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 16:43
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class App
{
    public static void main (String[] args)
    {
        /*
        Créer un personnage nommé « Diablon » de type « Tauren » avec une corne de 15 cm;
        Créer un personnage nommé « Azag» de type « Orc » avec des oreilles de 5 cm;
        L’utilisateur demande à Diablon d'attaquer Azag, cela n'a aucun effet;
        L’utilisateur demande à Azag d'attaquer Diablon, qui perd 5 points de vitalité;
        On modifie l'arme associée à Diablon en la rendant magique avec un coefficient de 2;
        Diablon attaque Azag qui perd 5 points de vitalité;
        On modifie l'arme associée à Diablon en lui ajoutant un amplificateur de coefficient 3;
        Diablon attaque Azag qui perd 8 points de vitalité;
        L’utilisateur crée un personnage nommé « ArKor» de type « Troll », bière préférée « Heineken ».
        */
    
        Tauren diablon = new Tauren("Diablon", 15);
        Orc azag = new Orc("Azag", 5);
    
        Refresh(diablon, azag);
    
        diablon.Attack(azag);
    
        Refresh(diablon, azag);
    
        azag.Attack(diablon);
    
        Refresh(diablon, azag);
    
        Weapon weaponDiablon = new Enchant(diablon.getWeapons().get(0), 2);
        diablon.replaceWeapon(diablon.getWeapons().get(0), weaponDiablon);
    
        Refresh(diablon, azag);
    
        diablon.Attack(azag);
    
        Refresh(diablon, azag);
    
        weaponDiablon = new Buff(diablon.getWeapons().get(0), 3);
        diablon.replaceWeapon(diablon.getWeapons().get(0), weaponDiablon);
    
        Refresh(diablon, azag);
    
        diablon.Attack(azag);
    
        Refresh(diablon, azag);
    }
    
    private static void Refresh (Personnage p1, Personnage p2)
    {
        System.out.println(p1.getName() + " : \n\t-> Vitality : " + p1.getVitality() + "\n\t-> Power : " + p1.getPower() + "\n\t-> Protection : " + p2.getProtection());
        System.out.println(p2.getName() + " : \n\t-> Vitality : " + p2.getVitality() + "\n\t-> Power : " + p2.getPower() + "\n\t-> Protection : " + p2.getProtection());
        System.out.println("\n");
    }
}
