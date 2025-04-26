import java.util.*;

class Person {
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age;
    }
}

public class SortPersonList {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sudarsan", 25, 3000),
                new Person("Sridharan", 22, 3500),
                new Person("Raj", 28, 4000)
        );

        people.sort(Comparator.comparingInt(p -> p.age));
        people.forEach(System.out::println);
    }
}
