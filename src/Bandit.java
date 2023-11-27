public class Bandit extends Unit {
    private int ulta = 0;

    Bandit(String name, int health) {
        super(health, name);
    }

    public int getUlta() {
        return ulta;
    }

    @Override
    public void getDamage(int damage) {
        health -= damage;
        health = Math.max(health, 0);
    }

    @Override
    public void doDamage(Unit unit) {
        if (ulta == 3) {
            unit.getDamage(30);
            ulta = 0;
        } else {
            unit.getDamage(10);
            ulta++;
        }
    }

    @Override
    public String toString() {
        return "Bandit{" +
                super.toString() +
                "ulta=" + ulta +
                '}';
    }
}
