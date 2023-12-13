import inst.nitjsr.hospitals.dblayer.*;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        d1.setId(1);
        d1.setName("Sushanto");
        d1.setChamberNumber("D403");
        d1.setSpecialization("Ortho");
        d1.insert(d1);
    }
}
