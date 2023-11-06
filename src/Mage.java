public class Mage extends Unit{
    int mana;

    Mage() {
        this(100, "B", 150);
    }

    Mage(Mage mage) {
        this(mage.health, mage.name, mage.mana);
    }

    Mage(int health, String name, int mana) {
        super(health, name);
        this.mana = mana;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Mana: %d\n", mana);
    }
}
