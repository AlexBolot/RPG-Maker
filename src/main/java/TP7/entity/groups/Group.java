package TP7.entity.groups;

import TP7.entity.Entity;

/*................................................................................................................................
 . Copyright (c)
 .
 . The Group	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public abstract class Group extends Entity {
    private String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public abstract float getPower();

    public abstract float getProtection();

    public abstract String toString();
}
