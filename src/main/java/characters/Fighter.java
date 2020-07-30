package characters;

import tools.IWeapon;

public class Fighter extends Player {

  private IWeapon iweapon;

  public Fighter(String name, int healthPoints, IWeapon iweapon){
      super(name, healthPoints);
      this.iweapon = iweapon;
  }

    public IWeapon getIweapon() {
        return iweapon;
    }

    public void setIweapon(IWeapon iweapon) {
        this.iweapon = iweapon;
    }

    public void attackEnemy(Character enemy) {
      enemy.takeDamage(this.iweapon.attack());
    }
}
