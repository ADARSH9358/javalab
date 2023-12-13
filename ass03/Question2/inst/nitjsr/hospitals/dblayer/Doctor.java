package inst.nitjsr.hospitals.dblayer;

public class Doctor implements DBEntity {
    private int id;
    private String name;
    private String specialization;
    private String chamberNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setChamberNumber(String chamberNumber) {
        this.chamberNumber = chamberNumber;
    }

    public void insert(DBEntity entity) {
        Doctor doc = (Doctor) entity;
        System.out.println("Insert Doctor with id " + doc.id + " into database");
    }

    public void delete(int id) {
        System.out.println("Deleting Doctor with id " + id + " into database");
    }

    public void update(int id, DBEntity entity) {
        Doctor doc = (Doctor) entity;
        System.out.println("Modifying information of Doctor with id " + doc.id + "in database.");
    }
}