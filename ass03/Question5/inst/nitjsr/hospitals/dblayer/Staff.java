package inst.nitjsr.hospitals.dblayer;

public class Staff extends DBEntity {
    private int id;
    private String name;
    private String department;
    private float salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void insert(DBEntity entity) {
        Staff s = (Staff) entity;
        System.out.println("Insert Staff with id " + s.id + " into database");
    }

    public void delete(int id) {
        System.out.println("Deleting Staff with id " + id + " into database");
    }

    public void update(int id, DBEntity entity) {
        Staff s = (Staff) entity;
        System.out.println("Modifying information of Staff with id " + s.id + "in database.");
    }
}