package characters;

import org.junit.Before;
import org.junit.Test;
import tools.IWeapon;
import tools.Sword;

import static org.junit.Assert.*;

public class OrcTest {

    private Orc orc;
    private Sword sword;

    @Before
    public void before() {
        sword = new Sword();
        orc = new Orc("Orcy", sword);
    }

    @Test
    public void getWeapon() {
        assertEquals(sword, orc.getWeapon());
    }
}