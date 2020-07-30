package characters;

import org.junit.Before;
import org.junit.Test;
import tools.*;

import static org.junit.Assert.*;

public class WizardTest {

  private Wizard wizard;
  private Ogre ogre;
  private LightningStrike lightningStrike;


    @Before
    public void before() {
      ogre = new Ogre();
      lightningStrike = new LightningStrike();
      wizard = new Wizard("Augwaay", ogre, lightningStrike);

    }

    @Test
    public void getIdefend() {
      assertEquals(ogre, wizard.getIdefend());
    }

    @Test
    public void getISpell() {
      assertEquals(lightningStrike, wizard.getISpell());
    }

    @Test
    public void setDefender() {
      Dragon dragon = new Dragon();
      wizard.setDefender(dragon);
      assertEquals(dragon, wizard.getIdefend());
    }

    @Test
    public void setSpell() {
      Fireball fireball = new Fireball();
      wizard.setSpell(fireball);
      assertEquals(fireball, wizard.getISpell());
    }

    @Test
    public void castOnEnemy() {
       Axe axe = new Axe();
       Orc orc = new Orc("Orcy", axe);
       wizard.castOnEnemy(orc);
       assertEquals(140, orc.getHealthPoints());
    }

    @Test
    public void defendAgainstEnemy() {
      Axe axe = new Axe();
      Orc orc = new Orc("Orcy", axe);
      wizard.defendAgainstEnemy(orc);
      assertEquals( 570, wizard.getHealthPoints());
    }

    @Test
    public void getName() {
      assertEquals("Augwaay", wizard.getName());
    }

    @Test
    public void getHealthPoints() {
      assertEquals(600, wizard.getHealthPoints());
    }

    @Test
    public void takeDamage() {
      wizard.takeDamage(100);
      assertEquals(500, wizard.getHealthPoints());
    }
}