package ru.battlefield.units;

public class Transport extends AbstractMachine implements Shootable {
    private short armour;

    public Transport(short armour, short fuel) {
        super(fuel);
        this.armour = armour;
    }

    @Override
    public void getShot(short shootPower) {
        short fuel = getFuel();

        if(armour == 0) {
            setFuel((short) (fuel - shootPower));
        } else {
            setFuel((short) (fuel -shootPower / armour));
        }
    }
}
