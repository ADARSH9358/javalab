package inst.nitjsr.hospitals.dblayer;

public interface DBEntity {
    void insert(DBEntity entity);

    void update(int id, DBEntity entity);

    void delete(int id);
}
