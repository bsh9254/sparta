package com.example.sparta.withstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sword", ItemType.WEAPON));
        items.add(new Item("Potion", ItemType.CONSUMABLE));
        items.add(new Item("Shield", ItemType.ARMOR));

//        스트림 적용
        List<Item> weapons = items.stream()
                .filter(item -> item.getType() == ItemType.WEAPON)
                .toList();

        weapons.forEach(System.out::println);
    }
}