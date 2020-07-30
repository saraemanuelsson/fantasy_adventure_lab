package characters;

import tools.IDefend;
import tools.ISpell;

public class Warlock extends Mage {

    public Warlock (String name, IDefend iDefend, ISpell iSpell) {
      super(name, 300, iDefend, iSpell);
   }
}
