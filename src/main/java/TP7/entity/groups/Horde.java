package TP7.entity.groups;

import TP7.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Horde	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class Horde extends Group {
    private ArrayList<Entity> entities = new ArrayList<>();

    public Horde(String name) {
        setName(name);
    }

    public Horde(Horde horde) {
        setName(horde.getName());
        getSoldiers().addAll(horde.getSoldiers());
    }

    //region Getters and Setters
    public ArrayList<Entity> getSoldiers() {
        return entities;
    }

    public void addSoldiers(Entity... entities) {
        Collections.addAll(getSoldiers(), entities);
    }

    @Override
    public float getPower() {
        float hordePower = 0;

        for (Entity e : getSoldiers()) {
            hordePower += e.getPower();
        }

        return hordePower * 0.75f;
    }

    @Override
    public float getProtection() {
        float hordeProtection = 0;

        for (Entity e : getSoldiers()) {
            hordeProtection += e.getProtection();
        }

        return hordeProtection * 0.75f;
    }
    //endregion

    @Override
    public String toString() {
        StringBuilder soldiersList = new StringBuilder();
        for (Entity e : getSoldiers()) {
            soldiersList.append("\t\t").append(e);
        }

        String className = this.getClass().toString().substring(17);
        return className + " :\n\tSoldiers :\n" + soldiersList;
    }
}
