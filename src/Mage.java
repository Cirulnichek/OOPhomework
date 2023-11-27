public class Mage extends Unit{
    private int mana;

    Mage(String name, int health, int mana) {
        super(health, name);
        this.mana = mana;
    }

    @Override
    public void doDamage(Unit unit) {
        if (this.mana > 10) {
            unit.getDamage(20);
        } else {
            unit.getDamage(5);
        }
        mana--;
    }

    @Override
    public void getDamage(int damage) {
        this.health -= damage;
        this.health = Math.max(this.health, 0);
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Mage{" +
                super.toString() +
                "mana=" + mana +
                '}';
    }
}
