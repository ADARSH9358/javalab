package inst.nitjsr.hospitals.dblayer;

public abstract class DBEntity {
    public static DBEntity getEntity(String type) {
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

    public void alter() {
        System.out.println("Implementation in progress");
    }

    abstract void insert(DBEntity entity);

    abstract void update(int id, DBEntity entity);

    abstract void delete(int id);
}
