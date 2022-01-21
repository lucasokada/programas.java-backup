package com.company;

import com.company.interfaces.Burger;

public abstract class BurgerBuilder implements Burger {
    protected String name;
    protected Integer patties;
    protected Boolean bacon;
    protected Boolean cheese;
    protected Boolean pickles;
    protected Boolean ketchup;
    protected Boolean mustard;
    protected Boolean lettuce;
    protected Boolean tomato;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPatties() {
        return this.patties;
    }

    @Override
    public Boolean getBacon() {
        return this.bacon;
    }

    @Override
    public Boolean getCheese() {
        return this.cheese;
    }

    @Override
    public Boolean getPickles() {
        return this.pickles;
    }

    @Override
    public Boolean getKetchup() {
        return this.ketchup;
    }

    @Override
    public Boolean getMustard() {
        return this.mustard;
    }

    @Override
    public Boolean getLettuce() {
        return this.lettuce;
    }

    @Override
    public Boolean getTomato() {
        return this.tomato;
    }

    @Override
    public String toString() {
        return "BurgerBuilder{" +
                "name='" + name + '\'' +
                ", patties=" + patties +
                ", bacon=" + bacon +
                ", cheese=" + cheese +
                ", pickles=" + pickles +
                ", ketchup=" + ketchup +
                ", mustard=" + mustard +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                '}';
    }
}
