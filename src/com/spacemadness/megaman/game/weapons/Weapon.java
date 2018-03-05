package com.spacemadness.megaman.game.weapons;

public class Weapon {
    private final WeaponType type;
    private int power;

    Weapon(WeaponType type, int power) {
        this.type = type;
        this.power = power;
    }

    public void attack() {

    }

    public WeaponType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    void setPower(int power) {
        this.power = power;
    }
}
