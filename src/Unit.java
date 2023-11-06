public class Unit {
    int health;
    String name;

    Unit() {
        this(100, "A");
    }

    Unit(Unit other) {
        this.health = other.health;
        this.name = other.name;
    }

    Unit(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void print() {
        System.out.printf("Health: %d\n", health);
        System.out.printf("Name: %s\n", name);
    }
}
