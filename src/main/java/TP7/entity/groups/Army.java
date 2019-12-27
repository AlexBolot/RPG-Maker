package TP7.entity.groups;

import TP7.entity.personnages.Character;

import java.util.ArrayList;
import java.util.Collections;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Army	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

@SuppressWarnings({"WeakerAccess", "unused"})
public class Army extends Group {
    private Character general;
    private ArrayList<Battalion> battalions = new ArrayList<>();

    public Army(String name, Character general) {
        setName(name);
        this.general = general;
    }

    public Army(Army army) {
        setName(army.getName());
        getBattalions().addAll(army.getBattalions());
    }

    //region Getters and Setters
    public Character getGeneral() {
        return general;
    }

    public ArrayList<Battalion> getBattalions() {
        return battalions;
    }

    public void addBattalion(Battalion... battalions) {
        Collections.addAll(getBattalions(), battalions);
    }

    @Override
    public float getPower() {
        float armyPower = getGeneral().getPower();

        for (Battalion battalion : getBattalions()) {
            armyPower += battalion.getPower();
        }

        return armyPower;
    }

    @Override
    public float getProtection() {
        float armyProtection = getGeneral().getProtection();

        for (Battalion battalion : getBattalions()) {
            armyProtection += battalion.getProtection();
        }

        return armyProtection;
    }
    //endregion

    @Override
    public String toString() {
        StringBuilder battalionsList = new StringBuilder();
        for (Battalion battalion : getBattalions()) {
            battalionsList.append("\t\t").append(battalion);
        }

        String className = this.getClass().toString().substring(17);
        return className + " :\n\tGenerals :\n\t\t" + general + "\n\tBattalions :\n" + battalionsList;
    }
}
