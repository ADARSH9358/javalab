public abstract class Employee {
    private int id;
    private String name;
    private String office;
    private String designation;

    public abstract void insert();

    public abstract void delete();

    public Employee(int id, String name, String office, String designation) {
        this.id = id;
        this.name = name;
        this.office = office;
        this.designation = designation;
    }

    public static Employee getEmployee(String type){
        switch (type) {
            case "developer": return new Developer(01,"jal","new");
            case "manager": return new Manager(01,"jal","new");

                
            
        
            default: return null;
                
        }
    }







 

}

    // public static Employee getEmployee(String type) {

   //     switch (type) {
    //         case "developer":
    //             return new Developer(1, "A", "CS");
    //         case "manager":
    //             return new Manager(1, "B", "HR");
    //         default:
    //             return null;
    //     }
    // }