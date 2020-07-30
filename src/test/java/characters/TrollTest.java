package characters;

import org.junit.Before;
import org.junit.Test;
import tools.Axe;
import tools.Club;
import tools.IWeapon;
import tools.Sword;

import static org.junit.Assert.*;

public class TrollTest {
    
    private Troll troll;
    private Axe axe;

    @Before
    public void before() {
        axe = new Axe();
        troll = new Troll("Trolly", axe);
    }

    @Test
    public void getWeapon() {
        assertEquals(axe, troll.getWeapon());
    }

    @Test
    public void setWeapon() {
        Club club = new Club();
        troll.setWeapon(club);
        assertEquals(club, troll.getWeapon());
    }

    @Test
    public void getName() {
        assertEquals("Trolly", troll.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(100, troll.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        troll.takeDamage(50);
        assertEquals(50, troll.getHealthPoints());
    }
}