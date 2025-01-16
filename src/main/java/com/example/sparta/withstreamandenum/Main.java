package com.example.sparta.withstreamandenum;

import com.example.sparta.withstreamandenum.Item;
import com.example.sparta.withstreamandenum.ItemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Item> items = List.of(
                new Item("Sword", ItemType.WEAPON),
                new Item("Potion", ItemType.CONSUMABLE),
                new Item("Shield", ItemType.ARMOR),
                new Item("Axe", ItemType.WEAPON)
        );

        Map<ItemType, Long> itemCountByType = items.stream()
                .collect(Collectors.groupingBy(Item::getType, Collectors.counting()));

        itemCountByType.forEach((type, count) ->
                System.out.println(type + ": " + count)
        );

        //특정 타입의 아이템 이름만 출력하기
        items.stream()
                .filter(item -> item.getType() == ItemType.WEAPON)
                .map(Item::getName)
                .forEach(name -> System.out.println("Weapon: " + name));

        //타입별로 아이템 리스트를 그룹화
        Map<ItemType, List<Item>> itemsByType = items.stream()
                .collect(Collectors.groupingBy(Item::getType));

        itemsByType.forEach((type, itemList) -> {
            System.out.println(type + " items:");
            itemList.forEach(System.out::println);
        });
    }
}