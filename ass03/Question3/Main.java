import inst.nitjsr.hospitals.dblayer.*;

public class Main {
    public static void main(String[] args) {
        Patient p1 = (Patient) DBEntity.getEntity("Patient");
        p1.setId(1);
        p1.setName("Sushanto");
        p1.setAge(23);
        p1.setGender("male");
        p1.insert(p1);
    }
}
