package com.workintech.models;

import com.workintech.enums.BreakRollType;

public class DeluxeBurger extends Hamburger {
    private Cips cips;
    private Drink drink;

    public DeluxeBurger(Drink drink,Cips cips) {
        super("DeluxeBurger", "Double", 19.20, BreakRollType.MIDDLE);
        this.drink=drink;
        this.cips=cips;
    }

    @Override
    public void add(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenmez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("Drink: " + drink.getType() + "\n");
        builder.append("cipıs: " + cips.getCipsTypes() + "\n");

        super.itemizeHamburger();
    }
}
