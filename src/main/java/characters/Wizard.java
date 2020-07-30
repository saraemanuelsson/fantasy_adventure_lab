package characters;

import tools.IDefend;
import tools.ISpell;

public class Wizard extends Mage {

    public Wizard (String name, IDefend idefend, ISpell ispell) {
      super(name, 600, idefend, ispell);
   }
}
