package com.company;

public class Cow extends FarmAnimal {

    public Cow(String name) {
        super(name);
    }

    @Override // override decorator
    public String noise() { // overrides method noise from FarmAnimal
        return "moo";
    }

}
