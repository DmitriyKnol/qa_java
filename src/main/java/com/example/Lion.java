package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Predator predator;
    Kittens kittens;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.predator = feline;
        this.kittens = feline;
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
