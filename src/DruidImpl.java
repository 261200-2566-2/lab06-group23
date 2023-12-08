/*
druid cast natural element that deal damage to target
requires : naturalElement and target are not null
effects : target receive damage and print spell activate notification
 */
public class DruidImpl extends MageImpl implements Druid {
    @Override
    public void castNaturalPower(String naturalElement, Mage target) {
        if (naturalElement.equals("thunder")) {
            double damage = 5 * 0.1 * spellpower;
            System.out.println("Thunder spell activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 20;
        } else if (naturalElement.equals("tornado")) {
            double damage = 3 * 0.1 * spellpower;
            System.out.println("Tornado spell activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 5;
        }
    }
}