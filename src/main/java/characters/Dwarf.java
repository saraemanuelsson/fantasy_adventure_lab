package characters;

import tools.IWeapon;

public class Dwarf extends Fighter {

  private int coins;

  public Dwarf(String name, IWeapon weapon, int coins) {
    super(name, 300, weapon);
    this.coins = coins;
  }

  public int getCoins() {
    return coins;
  }

  public void setCoins(int coins) {
    this.coins = coins;
  }

  public void addCoins(int numberOfCoins) {
    this.coins += numberOfCoins;
  }

  public void payCoins(int amount) {
    if (amount <= this.coins) {
      this.coins -= amount;
    }
  }
}
