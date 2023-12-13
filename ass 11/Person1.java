import java.util.ArrayList;
import java.util.List;

class Person {
    public String name;
    public String address;
    public String job;
    public String office;

    public Person(String name, String address, String job, String office) {
        this.name = name;
        this.address = address;
        this.job = job;
        this.office = office;
    }

    public Person(String string, int i) {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public String getOffice() {
        return office;
    }

    public String getAge() {
        return null;
    }
}

public class Person1 {
    public static void main(String[] args) {
       ArrayList<Person> persons = new ArrayList<>();

        // Add persons to the list
        Person pk=new Person("ada", "try", "pag", "try");
        persons.add(new Person("John", "123 Main St", "Engineer", "Office A"));
        persons.add(new Person("Alice", "456 Elm St", "Teacher", "Office B"));
        persons.add(new Person("Bob", "789 Oak St", "Doctor", "Office C"));
        persons.add(pk);

        // Traverse the list and print information of each p
        for (Person p : persons) {
            System.out.println("Name: " + p.name);
            System.out.println("Address: " + p.getAddress());
            System.out.println("Job: " + p.getJob());
            System.out.println("Office: " + p.getOffice());
            System.out.println();
        }
    }
}

