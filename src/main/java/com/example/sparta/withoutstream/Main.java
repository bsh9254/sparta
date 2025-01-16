package com.example.sparta.withoutstream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //스트림 사용 전
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sword", ItemType.WEAPON));
        items.add(new Item("Potion", ItemType.CONSUMABLE));
        items.add(new Item("Shield", ItemType.ARMOR));
        List<Item> weapons = new ArrayList<>();

        for (Item item : items) {
            if (item.getType() == ItemType.WEAPON) {
                weapons.add(item);
            }
        }

        for (Item weapon : weapons) {
            System.out.println(weapon);
        }

    }
}