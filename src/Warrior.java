public class Warrior extends Unit {
    private int armor;

    Warrior(String name, int health, int armor) {
        super(health, name);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void doDamage(Unit unit) {
        unit.getDamage(15);
    }

    @Override
    public void getDamage(int damage) {
        if (this.armor > 0) {
            this.health -= damage / this.armor;
        } else {
            this.health -= damage;
        }
        this.armor--;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                super.toString() +
                "armor=" + armor +
                '}';
    }
}
