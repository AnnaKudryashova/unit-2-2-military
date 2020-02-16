package ru.battlefield.units;

abstract class AbstractMachine extends AbstractArmyUnit {
    private short fuel;

    protected AbstractMachine(short fuel) {
        this.fuel = fuel;
    }

    protected short getFuel() {
        return fuel;

    }

    protected void setFuel(short fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "AbstractMachine{" +
                "fuel=" + fuel +
                '}';

}

}
