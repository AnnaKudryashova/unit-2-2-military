package ru.battlefield;

import ru.battlefield.units.*;

public class Battlefield {

    public static short sShootPower = 12;
    public static short sHealth = 50;
    public static short sArmour = 2;

    public static void main(String[] args){
        Soldier soldier1 = new Soldier (sShootPower, sHealth, sArmour);
        Soldier soldier2 = new Soldier(sShootPower, sHealth, sArmour);
        Transport transport = new Transport((short) 4, (short) 80);

        soldier1.shoot(soldier2);
        soldier1.shoot(transport);

        System.out.println(soldier1.toString());
        System.out.println(soldier2.toString());
        AbstractArmyUnit[] army1 = new AbstractArmyUnit[4];
        army1[0] = new Soldier(sShootPower, sHealth, sArmour);
        army1[1] = new Transport((short) 4, (short) 80);
        army1[2] = new Soldier(sShootPower, sHealth, sArmour);
        army1[3] = new Transport((short) 4, (short) 80);

        Transport enemy = new Transport((short) 4, (short) 80);

        for (int i = 0; i < 4; i++) {

            for(int j = 0; j < army1.length; j++) {
                if(army1[j] instanceof Shooter) {
                    Shooter shooter = (Shooter) army1[j];
                    shooter.shoot(enemy);
                }
            }
        }
        System.out.println(enemy.toString());

    }
}
