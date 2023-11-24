package com.workintech.models;

import com.workintech.enums.BreakRollType;

public class HealthyBurger extends Hamburger {

    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name, double price, BreakRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    public void setHealthyAddition(String name, double price) {
        if (healthyAddition1 == null) {
            healthyAddition1 = new Addition(name, price);
        } else if (healthyAddition2 == null) {
            healthyAddition2 = new Addition(name, price);
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();

        if (getHealthyAddition1() != null) {
            builder.append("Healtyburger" + getHealthyAddition1().getName() + "\n");
            setPrice(getPrice() + getHealthyAddition1().getPrice());//senkron çalışır.
        }
        if (getHealthyAddition2() != null) {
            builder.append("Healtyburger" + getHealthyAddition2().getName() + "\n");
            setPrice(getPrice() + getHealthyAddition2().getPrice());//senkron çalışır.
        }
        System.out.println("\n " + builder);
        super.itemizeHamburger();
    }
}
