package com.spacemadness.megaman.game;

import com.spacemadness.megaman.core.MovableGameObject;

public class Projectile extends MovableGameObject {
    private final int damage;

    public Projectile(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
