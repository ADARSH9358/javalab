public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("John", 25);
            System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

            Person person2 = new Person("Jane", -5);
            System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        } catch (InvalidEntryException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            if (Person.personCount > 0)
                System.out.println("Person objects created");
        }
    }

}