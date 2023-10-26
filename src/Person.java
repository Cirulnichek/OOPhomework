public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (0 < age && age < 200) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public int birthday() {
        age++;
        return age;
    }
}
