package com.workintech.models;

import com.workintech.enums.DrinkTypes;

public class Drink {
    private DrinkTypes type;

    public Drink(DrinkTypes type) {
        this.type = type;
    }

    public DrinkTypes getType() {
        return type;
    }
}
