package TP7.entity.personnages;

import TP7.weapons.Shield;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static TP7.factories.types.HandType.LEFT;
import static org.junit.Assert.assertEquals;

/*................................................................................................................................
 . Copyright (c)
 .
 . The CharacterTest	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class CharacterTest {
    private final float hornSize = generateHornSize();
    private final float delta = 0.001f;
    private Character human = new Human("Radcliffe", "Bleu");
    private Character tauren = new Tauren("Powaeesha", hornSize);

    private float generateHornSize() {
        //We set the EarSize random between 200mm and 700mm
        int randInt = ThreadLocalRandom.current().nextInt(200, 700);
        return randInt / 100;
    }

    @Test
    public void addWeapon() {
        human.addWeapon(LEFT, new Shield());
        assertEquals(2, human.getWeapons().size());
    }

    @Test
    public void dropWeapon() {
        human.addWeapon(LEFT, new Shield());
        human.dropWeapon(LEFT);
        assertEquals(1, human.getWeapons().size());
    }

    @Test
    public void getName() {
        assertEquals("Radcliffe", human.getName());
        assertEquals("Powaeesha", tauren.getName());
    }

    @Test
    public void getVitality1() {
        assertEquals(100f, human.getVitality(), delta);
        assertEquals(100f, tauren.getVitality(), delta);
    }

    @Test
    public void getVitality2() {
        human.attack(tauren);

        assertEquals(100f, human.getVitality(), delta);
        assertEquals(95f, tauren.getVitality(), delta);
    }

    @Test
    public void getPower1() {
        assertEquals(25f, human.getPower(), delta);
        assertEquals(5f, tauren.getPower(), delta);
    }

    @Test
    public void getPower2() {
        human.attack(tauren);
        tauren.attack(human);

        assertEquals(25f, human.getPower(), delta);
        assertEquals(4.8f, tauren.getPower(), delta);
    }

    @Test
    public void getProtection1() {
        assertEquals(5f, human.getProtection(), delta);
        assertEquals(20f, tauren.getProtection(), delta);
    }

    @Test
    public void getProtection2() {
        human.attack(tauren);
        tauren.attack(human);

        assertEquals(5f, human.getProtection(), delta);
        assertEquals(19f, tauren.getProtection(), delta);
    }

    @Test
    public void attack() {
        human.attack(tauren);
        assertEquals(95f, tauren.getVitality(), delta);
    }
}