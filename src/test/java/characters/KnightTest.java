package characters;

import org.junit.Before;
import org.junit.Test;
import tools.Axe;
import tools.Sword;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;
    Sword sword;

    @Before
    public void before() {
      sword = new Sword();
      knight = new Knight("Zoro", sword);
    }

    @Test
    public void getIweapon() {
      assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void setIweapon() {
      Axe axe = new Axe();
      knight.setWeapon(axe);
      assertEquals(axe, knight.getWeapon());
    }

    @Test
    public void attackEnemy() {
      Orc orc = new Orc("Orcy", sword);
      knight.attackEnemy(orc);
      assertEquals(170, orc.getHealthPoints());
    }

    @Test
    public void getName() {
      assertEquals("Zoro", knight.getName());
    }

    @Test
    public void getHealthPoints() {
      assertEquals(600, knight.getHealthPoints());
    }

    @Test
    public void takeDamage() {
      knight.takeDamage(30);
      assertEquals(570, knight.getHealthPoints());
    }

    @Test
    public void getHorseSpeed() {
      assertEquals(300, knight.getHorseSpeed());
    }

    @Test
    public void setHorseSpeed() {
      knight.setHorseSpeed(400);
      assertEquals(400, knight.getHorseSpeed());
    }
}