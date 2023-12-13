import inst.nitjsr.hospitals.dblayer.*;

public class Main {
    public static void main(String[] args) {
        Staff s1 = (Staff) DBEntity.getEntity("Staff");
        s1.setId(1);
        s1.setName("Sushanto");
        s1.setDepartment("Pharmacy");
        s1.setSalary(30000);
        s1.insert(s1);
        s1.alter();
    }
}
