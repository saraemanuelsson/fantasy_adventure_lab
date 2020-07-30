package characters;

import org.junit.Before;
import org.junit.Test;
import tools.Axe;
import tools.Sword;

import static org.junit.Assert.*;

public class BarbarianTest {

    private Barbarian barbarian;
    private Sword sword;

    @Before
    public void before() {
        sword = new Sword();
        barbarian = new Barbarian("Barbie", sword);
    }

    @Test
    public void getIweapon() {
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void setIweapon() {
        Axe axe = new Axe();
        barbarian.setWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void attackEnemy() {
        Troll troll = new Troll("Trolly", sword);
        barbarian.attackEnemy(troll);
        assertEquals(70, troll.getHealthPoints());
    }

    @Test
    public void getName() {
        assertEquals("Barbie", barbarian.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(500, barbarian.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        barbarian.takeDamage(200);
        assertEquals(300, barbarian.getHealthPoints());
    }

    @Test
    public void getHandPower() {
        assertEquals(100, barbarian.getHandPower());
    }

    @Test
    public void setHandPower() {
        barbarian.setHandPower(50);
        assertEquals(50, barbarian.getHandPower());
    }

    @Test
    public void fightEnemyBareHands() {
        Orc orc = new Orc("Orcy", sword);
        barbarian.fightEnemyBareHands(orc);
        assertEquals(100, orc.getHealthPoints());
    }
}