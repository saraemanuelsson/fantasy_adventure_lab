package characters;

import tools.IWeapon;

public class Barbarian extends Fighter {
    
    private int handPower;

    public Barbarian(String name, IWeapon weapon) {
        super(name, 500, weapon);
        this.handPower = 100;
    }

    public int getHandPower() {
        return handPower;
    }

    public void setHandPower(int handPower) {
        this.handPower = handPower;
    }

    public void fightEnemyBareHands(Character enemy) {
        enemy.takeDamage(this.handPower);
    }
}
