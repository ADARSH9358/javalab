public class Main {
    public static void main(String[] args) {
        // Employee emp;
        // emp = Employee.getEmployee("developer");
        // emp.insert();
        // emp.delete();
        // emp = Employee.getEmployee("manager");
        // emp.insert();
        // emp.delete();
        Employee e;
        e=Employee.getEmployee("developer");
        e.delete();
    }
}