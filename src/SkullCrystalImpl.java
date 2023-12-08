public class SkullCrystalImpl implements SkullCrystal {
    private double maxMana;
    private double spellpower;
    /*
    enemy next attack damage = 0
    effects : you receive no damage
     */
    @Override
    public void cancelEnemyAttack() {
        System.out.println("Enemy attack canceled.");
    }
    @Override
    public void upMagicStat() {
        maxMana += 20;
        spellpower += 20;
    }

}