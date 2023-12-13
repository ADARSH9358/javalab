package inst.nitjsr.hospitals.dblayer;

public class Patient implements DBEntity {
    private int id;
    private String name;
    private int age;
    private String gender;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void insert(DBEntity entity) {
        Patient p = (Patient) entity;
        System.out.println("Insert Patient with id " + p.id + " into database");
    }

    public void delete(int id) {
        System.out.println("Deleting Patient with id " + id + " into database");
    }

    public void update(int id, DBEntity entity) {
        Patient p = (Patient) entity;
        System.out.println("Modifying information of Patient with id " + p.id + "in database.");
    }
}