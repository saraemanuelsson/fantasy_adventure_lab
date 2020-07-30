package characters;

import org.junit.Before;
import org.junit.Test;
import tools.Axe;
import tools.Club;

import static org.junit.Assert.*;

public class DwarfTest {

    private Dwarf dwarf;
    private Axe axe;

    @Before
    public void before(){
        axe = new Axe();
        dwarf = new Dwarf("Sleepy", axe, 30);
    }

    @Test
    public void getIweapon() {
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void setIweapon() {
        Club club = new Club();
        dwarf.setWeapon(club);
        assertEquals(club, dwarf.getWeapon());
    }

    @Test
    public void getName() {
        assertEquals("Sleepy", dwarf.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(300, dwarf.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        dwarf.takeDamage(10);
        assertEquals(290, dwarf.getHealthPoints());
    }

    @Test
    public void getCoins() {
        assertEquals(30, dwarf.getCoins());
    }

    @Test
    public void addCoins() {
        dwarf.addCoins(15);
        assertEquals(45, dwarf.getCoins());
    }

    @Test
    public void payCoins() {
        dwarf.payCoins(10);
        assertEquals(20, dwarf.getCoins());
    }

    @Test
    public void canAttack() {
        Orc orc = new Orc("Orcy", axe);
        dwarf.attackEnemy(orc);
        assertEquals(150, orc.getHealthPoints());
    }
}