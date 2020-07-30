package characters;

import tools.IHeal;

public class Cleric extends Player {

    private IHeal healingTool;

    public Cleric(String name, IHeal healingTool) {
          super(name, 100);
          this.healingTool = healingTool;
    }

    public IHeal getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(IHeal healingTool) {
        this.healingTool = healingTool;
    }

    public void healPlayer(Player player) {
        int newHealth = player.getHealthPoints() + this.healingTool.heal();
        player.setHealthPoints(newHealth);
    }
}
