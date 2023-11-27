public abstract class Unit implements Fight {
    protected int health;
    private String name;

    Unit(Unit other) {
        this.health = other.health;
        this.name = other.name;
    }

    Unit(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }
}
