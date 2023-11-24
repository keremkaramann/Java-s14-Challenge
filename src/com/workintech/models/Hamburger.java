package com.workintech.models;

import java.util.Arrays;
import java.util.Objects;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private com.workintech.enums.BreakRollType breadRollType;
    private Addition[] additions;

    public Hamburger(String name, String meat, double price, com.workintech.enums.BreakRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions = new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public com.workintech.enums.BreakRollType getBreadRollType() {
        return breadRollType;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void add(String name, double price) {
        for (int i = 0; i < additions.length; i++) {
            if (additions[i] == null) {
                additions[i] = new Addition(name, price);
                break;
            }
        }
    }

    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("Breadroll: " + breadRollType + "\n");

        for (Addition addition : additions) {
            if (addition != null) {
                builder.append("Addition: " + addition.getName() + "\n");
                price = price + addition.getPrice();
            }
        }
        System.out.println(builder);
        System.out.println("Total price " + price);
        System.out.println("-------******--------");
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType=" + breadRollType +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return Double.compare(price, hamburger.price) == 0 && Objects.equals(name, hamburger.name) && Objects.equals(meat, hamburger.meat) && breadRollType == hamburger.breadRollType && Arrays.equals(additions, hamburger.additions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, meat, price, breadRollType);
        result = 31 * result + Arrays.hashCode(additions);
        return result;
    }
}
