public class SorcererImpl extends MageImpl implements Sorcerer {
    /*
    cast attack spell that deal damage to target twice
    requires : spellName and target are not null
    effects : target receive damage and print spell activate notification
     */
    @Override
    public void castSpellTwice(String spellName, Mage target) {
        if (spellName.equals("explosion")) {
            double damage = 2 * 0.1 * spellpower;
            System.out.println("Explosion spell activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 10;

            System.out.println("Explosion spell activated again. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 10;
        } else if (spellName.equals("barrier")) {
            double damageReduction = 2 * 0.1 * spellpower;
            System.out.println("Barrier activated. Damage reduction: " + damageReduction);
            currentMana -= 10;

            System.out.println("Barrier activated again. Damage reduction: " + damageReduction);
            currentMana -= 10;
        }
    }
}