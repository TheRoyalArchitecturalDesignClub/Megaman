package com.spacemadness.megaman.game.weapons;

public interface WeaponFactory {
    Weapon createWeapon(WeaponType type);
}
