public class BookOfSpellImpl implements BookOfSpell {
    private double maxMana;
    private double spellpower;
    private double currentMana;
    /*
    cast upgraded spell that deal damage to target
    requires : spellName and target are not null
    effects : target receive damage and print activate notification
     */
    @Override
    public void upgradeSpell(String spellName, Mage target) {
        if (spellName.equals("explosion")) {
            double damage = 3 * 0.1 * spellpower;
            System.out.println("Upgraded Explosion spell activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 7;
        }
    }
    /*
    get extra mana and spellpower
    effects : mana and spellpower increase
     */
    @Override
    public void upMagicStat() {
        maxMana += 20;
        spellpower += 20;
    }
}