package com.spacemadness.megaman.game;

import com.spacemadness.megaman.core.MovableGameObject;

public class Item extends MovableGameObject {
    private final ItemType type;

    public Item(ItemType type) {
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }
}
