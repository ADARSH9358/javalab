package inst.nitjsr.hospitals.dblayer;

public interface DBEntity {
    static DBEntity getEntity(String type) {
        switch (type) {
            case "Doctor":
                return new Doctor();
            case "Patient":
                return new Patient();
            case "Staff":
                return new Staff();
            default:
                return null;
        }
    }

    void insert(DBEntity entity);

    void update(int id, DBEntity entity);

    void delete(int id);
}
