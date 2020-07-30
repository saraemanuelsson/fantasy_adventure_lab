package characters;

import tools.IWeapon;

public class Fighter extends Player {

  private IWeapon weapon;

  public Fighter(String name, int healthPoints, IWeapon weapon){
      super(name, healthPoints);
      this.weapon = weapon;
  }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon iweapon) {
        this.weapon = iweapon;
    }

    public void attackEnemy(Character enemy) {
      enemy.takeDamage(this.weapon.attack());
    }
}
