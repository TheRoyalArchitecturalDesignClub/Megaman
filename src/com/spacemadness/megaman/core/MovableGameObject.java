package com.spacemadness.megaman.core;

import com.spacemadness.megaman.util.Vector2;

public class MovableGameObject extends GameObject {
    private final Vector2 velocity;

    public MovableGameObject() {
        velocity = new Vector2(0, 0);
    }

    public Vector2 getVelocity() {
        return velocity;
    }
}
