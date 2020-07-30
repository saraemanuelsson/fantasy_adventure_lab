package characters;

import tools.IWeapon;

public abstract class Enemy extends Character {

    private IWeapon weapon;

    public Enemy(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attackPlayer(Character player) {
        player.takeDamage(this.weapon.attack());
    }
}
