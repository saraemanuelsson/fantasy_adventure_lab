package characters;

import org.junit.Before;
import org.junit.Test;
import tools.*;

import static org.junit.Assert.*;

public class WarlockTest {

    private Warlock warlock;
    private Dragon dragon;
    private Fireball fireball;

    @Before
    public void before(){
        dragon = new Dragon();
        fireball = new Fireball();
        warlock = new Warlock("Warly", dragon, fireball);
    }

    @Test
    public void getIdefend() {
        assertEquals(dragon, warlock.getIdefend());
    }

    @Test
    public void getISpell() {
        assertEquals(fireball, warlock.getISpell());
    }

    @Test
    public void setDefender() {
        Ogre ogre = new Ogre();
        warlock.setDefender(ogre);
        assertEquals(ogre, warlock.getIdefend());
    }

    @Test
    public void setSpell() {
        LightningStrike lightningStrike = new LightningStrike();
        warlock.setSpell(lightningStrike);
        assertEquals(lightningStrike, warlock.getISpell());
    }

    @Test
    public void castOnEnemy() {
        Sword sword = new Sword();
        Troll troll = new Troll("Trolly", sword);
        warlock.castOnEnemy(troll);
        assertEquals(70, troll.getHealthPoints());
    }

    @Test
    public void defendAgainstEnemy() {
        Axe axe = new Axe();
        Troll troll = new Troll("Trolly", axe);
        warlock.defendAgainstEnemy(troll);
        assertEquals(300, warlock.getHealthPoints());
    }

    @Test
    public void getName() {
        assertEquals("Warly", warlock.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(300, warlock.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        warlock.takeDamage(100);
        assertEquals(200, warlock.getHealthPoints());
    }
}