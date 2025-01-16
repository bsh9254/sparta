package com.example.sparta.withenum;

public class Main {
    public static void main(String[] args) {

        Item sword = new Item("Sword", ItemType.WEAPON);
        Item potion = new Item("Potion", ItemType.CONSUMABLE);


        System.out.println(sword);
        System.out.println(potion);
    }
}