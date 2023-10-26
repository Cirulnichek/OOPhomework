public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", 20);
        person.printInfo();
        int age = person.birthday();
        System.out.println("Возраст: " + age);
        System.out.println("А пользователь: " + person);

        Student student = new Student("Alice", 18, "6A");
        student.printInfo();
        int ageStudent = student.birthday();
        System.out.println("Возраст студента: " + ageStudent);
    }
}