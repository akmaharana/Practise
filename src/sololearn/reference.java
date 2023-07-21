package sololearn;

public class reference {
    public static void main(String[] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        change(j);
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }

    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }

    static void change(Person p) {

        p.setAge(10);

    }

}

class Person {
    private final String name;
    private int age;

    Person(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}
