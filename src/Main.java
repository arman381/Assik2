import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Developer", 50000.00);


        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.8);

        List<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            if (p instanceof Employee) {
                Employee e = (Employee) p;
                System.out.println(e + " earns " + String.format("%.2f", e.getPaymentAmount()) + " tenge");
            } else if (p instanceof Student) {
                Student s = (Student) p;
                System.out.println(s + " earns " + String.format("%.2f", s.getPaymentAmount()) + " tenge");
            }
        }
    }
}