import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(dni, ((Person) obj).dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public int compareTo(Person obj) {
        return this.dni.compareTo(obj.dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        Person p1 = new Person("Alice", "12345678");
        Person p2 = new Person("Bob", "12345679");

        persons.add(p1);
        persons.add(p2);
        System.out.println(persons);
    }
}
