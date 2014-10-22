package com.mefistofelerion.justrun;

import java.util.Random;

/**
 * Created by Ivan on 10/14/14.
 */
public class Creature extends CreatureBuilder {

    public Creature() {
        this.health = FULL_HEALTH;
        this.dead = false;
    }

    public void typeOfCreature(String type) {
        //set type of creature and give its form
    }

    public Creature getNewCreature() {
        return build();
    }


    private static final int FULL_HEALTH = 100;
    private static final int CRITICAL_HIT = 10;
    private static final int HIT = 5;

    private boolean dead;
    private int health;


    public void getHit() {
        Random rand = new Random();
        int n = rand.nextInt(1);
        boolean isCritical = n == 1 ? true : false;
        if (isCritical) {
            if (this.health > 0)
                this.health -= CRITICAL_HIT;
            else
                this.dead = true;
        } else {
            this.health -= HIT;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}