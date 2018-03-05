package com.spacemadness.megaman.game;

import com.spacemadness.megaman.game.weapons.Weapon;

public class Player extends Character {
    public static final int MAX_HEALTH = 100;

    private final Powerups powerups;
    private Weapon weapon;

    private int lives;
    private int scores;

    public Player() {
        super(MAX_HEALTH);
        powerups = new Powerups();
        lives = 1;
    }

    public void pickItem(Item item) {
        switch (item.getType()) {
            case OneUp:
                lives += 1;
                break;
            case LifeEnergyBig:
                heal(10);
                break;
            case LifeEnergySmall:
                heal(2);
                break;
            case MagnetBeam:
                powerups.add(Powerup.MagnetBeam);
                break;
        }
    }

    private void heal(int amount) {
        health = Math.min(health + amount, MAX_HEALTH);
    }

    @Override
    public void attack() {
        if (weapon != null) {
            weapon.attack();
        }
    }

    @Override
    public void die() {
    }
}
