import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя, здоровье и броню нового воина");
        Warrior warrior = new Warrior(scanner.next(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите имя, здоровье и количество маны для нового мага");
        Mage mage = new Mage(scanner.next(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите имя и здоровье нового бандита");
        Bandit bandit = new Bandit(scanner.next(), scanner.nextInt());
        System.out.println("Спасибо!!!");

        while (warrior.getHealth() > 0 || mage.getHealth() > 0 || bandit.getHealth() > 0) {
            if (warrior.getHealth() > 0) {
                System.out.println("Воин наносит урон магу");
                warrior.doDamage(mage);
                System.out.println("Здоровье мага: " + mage.getHealth());
                System.out.println("Воин наносит урон бандиту");
                warrior.doDamage(bandit);
                System.out.println("Здоровье бандита: " + bandit.getHealth());
            }
            if (mage.getHealth() > 0) {
                System.out.println("Маг наносит урон воину");
                mage.doDamage(warrior);
                System.out.println("Здоровье воина: " + warrior.getHealth());
                System.out.println("Защита воина" + warrior.getArmor());
                System.out.println("Маг наносит урон бандиту");
                mage.doDamage(bandit);
                System.out.println("Здоровье бандита: " + bandit.getHealth());
            }
            if (bandit.getHealth() > 0) {
                System.out.println("Бандит наносит урон воину");
                bandit.doDamage(warrior);
                System.out.println("Здоровье воина: " + warrior.getHealth());
                System.out.println("Защита воина" + warrior.getArmor());
                System.out.println("Бандит наносит урон магу");
                bandit.doDamage(mage);
                System.out.println("Здоровье мага: " + mage.getHealth());
            }
        }
    }
}