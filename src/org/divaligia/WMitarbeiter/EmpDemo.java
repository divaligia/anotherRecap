package org.divaligia.WMitarbeiter;

public class EmpDemo {
    public static void main(String[] args) {


        FixComissionEmployee f1 = new FixComissionEmployee("Huber", "Gerd", "HR", 1900, 1.2);


        EmployeeManager em = new EmployeeManager();
        em.addEmployee(new FixComissionEmployee("Stella", "Artois", "FunDep",2300, 200));
        em.addEmployee(new FixComissionEmployee("FX", "Dub", "FunDep",2500, 200));
        em.addEmployee(new FixComissionEmployee("Bens", "Uncle", "Cantina",1500, 400));

        em.addEmployee(new PercentCommissionEmployee("Reiter", "Rudi", "HR",2600, 1.2));

        System.out.println("em.calcTotalSalary() = " + em.calcTotalSalary());
        System.out.println("em.getSalarybyDepartment() = " + em.getSalarybyDepartment());
        System.out.println("em.getSalaryByDepartment2() = " + em.getSalaryByDepartment2());



    }
}
