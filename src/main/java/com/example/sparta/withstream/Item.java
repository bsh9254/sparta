package com.example.sparta.withstream;


public class Item {
    private String name;
    private ItemType type;

    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public ItemType getType() { return type; }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", type='" + type + '\'' + '}';
    }
}