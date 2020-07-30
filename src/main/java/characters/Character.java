package characters;

public abstract class Character {
  
  private String name;
  private int healthPoints;

    public Character(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damageValue) {
        this.healthPoints -= damageValue;
    }

}
