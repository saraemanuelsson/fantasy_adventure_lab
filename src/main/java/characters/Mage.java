package characters;

import tools.IDefend;
import tools.ISpell;

public abstract class Mage extends Player {

  private IDefend idefend;
  private ISpell ispell;

  public Mage(String name, int healthPoints, IDefend idefend, ISpell ispell) {
      super(name, healthPoints);
      this.idefend = idefend;
      this.ispell = ispell;
  }

  public IDefend getIdefend() {
      return this.idefend;
  }

   public ISpell getISpell() {
       return this.ispell;
  }

  public void setDefender(IDefend idefend) {
      this.idefend = idefend;
  }

    public void setSpell(ISpell ispell) {
      this.ispell = ispell;
  }

  public void castOnEnemy(Character enemy) {
      enemy.takeDamage(this.ispell.cast());
  }

  public void defendAgainstEnemy(Enemy enemy) {
      if (this.idefend.defend() < enemy.getWeapon().attack()) {
          takeDamage(enemy.getWeapon().attack() - this.idefend.defend());
      }
  }


}
