package characters;

import tools.IWeapon;

public class Knight extends Fighter {

    private int horseSpeed;

    public Knight(String name, IWeapon weapon) {
        super(name, 600, weapon);
        this.horseSpeed = 300;
    }

    public int getHorseSpeed() {
      return this.horseSpeed;
    }

    public void setHorseSpeed(int speed) {
      this.horseSpeed = speed;
    }
}
