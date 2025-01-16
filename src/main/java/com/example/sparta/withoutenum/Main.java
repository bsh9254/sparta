package com.example.sparta.withoutenum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //enum 사용 전
        Item sword = new Item("Sword", "Weapon");
        Item potion = new Item("Potion", "Consumable");

        System.out.println(sword);
        System.out.println(potion);
    }
}