package ru.battlefield.units;

abstract class AbstractHuman extends AbstractArmyUnit {

    private short health;
    private short armour;

    protected AbstractHuman(short health, short armour) {
        this.armour = armour;
        this.health = health;
    }
    public short getHealth() {
        return health;
    }

    public void setHealth(short health) { this.health = health; }

    public short getArmour() {
        return armour;
    }

    @Override
    public String toString() {
        return "AbstractHuman{" +
                "health=" + health +
                ", armour=" + armour +
                '}';
    }
}

