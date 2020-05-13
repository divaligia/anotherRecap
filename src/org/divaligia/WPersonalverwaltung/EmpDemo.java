package org.divaligia.WPersonalverwaltung;

public class EmpDemo {
    public static void main(String[] args) {
        
        EmployeeManager em = new EmployeeManager();
        
        em.addEmployee(new Employee(1, "Huber", 2100,"HR"));
        em.addEmployee(new Employee(2, "Gauß", 3500, "Buchhaltung"));
        em.addEmployee(new Employee(3, "Gößler", 1900, "Buchhaltung"));
        em.addEmployee(new Employee(4, "Guggi", 2700, "Verkauf"));
        em.addEmployee(new Employee(5, "Hensen", 2100, "Verkauf"));

        System.out.println("em.findByDepartment(\"HR\") = " + em.findByDepartment("HR"));
        System.out.println("em.findByMaxSalary() = " + em.findByMaxSalary());
        System.out.println("em.findByNumber(3) = " + em.findByNumber(3));

        
    }
}
