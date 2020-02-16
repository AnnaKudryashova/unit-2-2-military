package ru.battlefield.units;

public class Soldier extends AbstractHuman implements Shooter, Shootable {

    private short shootPower;

    public Soldier (short shootPower, short health, short armour) {
        super(health, armour);
        this.shootPower = shootPower;
    }

    @Override
    public void getShot(short shootPower) {
        short armour = getArmour();
        short health = getHealth();

        if(armour ==0) {
            setHealth((short) (health - shootPower));
        } else {
            setHealth((short) (health - shootPower / armour));
        }
    }

    @Override
    public void shoot (Shootable target) {
       target.getShot(shootPower);
    }

}
