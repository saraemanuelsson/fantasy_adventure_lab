package characters;

public abstract class Enemy extends Character {

    private iWeapon weapon;

    public Enemy(String name, int healthPoints, iWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public iWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(iWeapon weapon) {
        this.weapon = weapon;
    }
}
