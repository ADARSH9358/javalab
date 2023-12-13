package inst.nitjsr.hospitals.dblayer;

public class Patient implements DBEntity {
    public void insert(DBEntity entity) {
        System.out.println("From insert method of Patient Class.");
    }

    public void delete(int id) {
        System.out.println("From delete method of Patient Class.");
    }

    public void update(int id, DBEntity entity) {
        System.out.println("From update method of Patient Class.");
    }
}