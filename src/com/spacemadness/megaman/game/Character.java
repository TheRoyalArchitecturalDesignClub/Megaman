package com.spacemadness.megaman.game;

public abstract class Character {
    protected int health;

    Character(int health) {
        this.health = health;
    }

    public abstract void attack();
    public abstract void die();

    public void takeDamage(int amount) {
        health = Math.max(0, health - amount);
        if (health == 0) {
            die();
        }
    }

    public int getHealth() {
        return health;
    }
}
