package characters;

import org.junit.Before;
import org.junit.Test;
import tools.Club;
import tools.Herb;
import tools.Potion;

import static org.junit.Assert.*;

public class ClericTest {

    private Cleric cleric;
    private Potion potion;

    @Before
    public void before(){
        potion = new Potion();
        cleric = new Cleric("Clarice", potion);
    }

    @Test
    public void getName() {
        assertEquals("Clarice", cleric.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        cleric.takeDamage(20);
        assertEquals(80, cleric.getHealthPoints());
    }

    @Test
    public void setHealthPoints() {
        cleric.setHealthPoints(120);
        assertEquals(120, cleric.getHealthPoints());
    }

    @Test
    public void getHealingTool() {
        assertEquals(potion, cleric.getHealingTool());
    }

    @Test
    public void setHealingTool() {
        Herb herb = new Herb();
        cleric.setHealingTool(herb);
        assertEquals(herb, cleric.getHealingTool());
    }

    @Test
    public void healPlayer() {
        Club club = new Club();
        Knight knight = new Knight("Knighty", club);
        cleric.healPlayer(knight);
        assertEquals(620, knight.getHealthPoints());
    }
}