public class Person {
    private String name;
    private int age;
    static int personCount;

    static {
        personCount = 0;
    }

    public Person(String name, int age) {
        if (age < 0) {
            throw new InvalidEntryException("Age cannot be negative.",
                    new IllegalArgumentException("invalid age provided"));
        }
        this.name = name;
        this.age = age;
        personCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
