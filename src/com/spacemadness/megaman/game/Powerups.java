package com.spacemadness.megaman.game;

import java.util.ArrayList;
import java.util.List;

public class Powerups {
    private final List<Powerup> powerups;

    public Powerups() {
        powerups = new ArrayList<>();
    }

    public boolean add(Powerup powerup) {
        if (powerup == null) {
            throw new IllegalArgumentException("Powerup is null");
        }
        if (!hasPowerup(powerup)) {
            powerups.add(powerup);
            return true;
        }

        return false;
    }

    public boolean remove(Powerup powerup) {
        if (powerup == null) {
            throw new IllegalArgumentException("Powerup is null");
        }
        return powerups.remove(powerup);
    }

    public boolean hasPowerup(Powerup powerup) {
        if (powerup == null) {
            throw new IllegalArgumentException("Powerup is null");
        }
        return powerups.indexOf(powerup) != -1;
    }
}
