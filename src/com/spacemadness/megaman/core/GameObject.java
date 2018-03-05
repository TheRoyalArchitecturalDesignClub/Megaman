package com.spacemadness.megaman.core;

import com.spacemadness.megaman.util.Vector2;

public abstract class GameObject {
    private final Vector2 position;

    public GameObject() {
        this.position = new Vector2(0, 0);
    }
}
