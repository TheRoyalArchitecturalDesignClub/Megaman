package com.spacemadness.megaman.game.weapons;

import java.util.HashMap;
import java.util.Map;

public class DefaultWeaponFactory implements WeaponFactory {
    private final Map<WeaponType, WeaponProducer> producers;

    public DefaultWeaponFactory() {
        producers = new HashMap<>();
    }

    @Override
    public Weapon createWeapon(WeaponType type) {
        WeaponProducer producer = producers.get(type);
        if (producer == null) {
            throw new IllegalArgumentException("Unknown weapon type: " + type);
        }
        return producer.createWeapon();
    }

    public void register(WeaponType type, WeaponProducer producer) {
        if (type == null) {
            throw new IllegalArgumentException("Type is null");
        }
        if (producer == null) {
            throw new IllegalArgumentException("Producer is null");
        }
        producers.put(type, producer);
    }
}
