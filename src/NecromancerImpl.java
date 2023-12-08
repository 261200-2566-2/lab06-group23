public class NecromancerImpl extends MageImpl implements Necromancer {
    private boolean isSummon;
    /*
    summon spirit
     */
    @Override
    public void summonSpirit(String spiritName) {
        if (spiritName.equals("darkspirit")) {
            isSummon = true;
        }
    }
    /*
    spirit attack target
    requires : spiritName and target are not null
    effects : target receive damage and print attack notification
     */
    @Override
    public void spiritAttack(String spiritName, Mage target) {
        if (spiritName.equals("darkspirit") && isSummon) {
            double damage = 10 * 0.1 * spellpower;
            System.out.println("Dark Spirit's attack activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 30;
        }
    }
}