package org.divaligia.WPersonalverwaltung;

import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public Employee findByNumber(int number){
        for(Employee e : employees){
            if (e.getEmpNumber() == number){
                return e;
            }
        } return null;
    }

    public ArrayList<Employee> findByDepartment(String department){
        ArrayList<Employee> empByDep = new ArrayList<>();
        for(Employee e : employees){
            if(e.getDepartment().equals(department)){
                empByDep.add(e);
            }
        } return empByDep;
    }

    public Employee findByMaxSalary(){
        double hoechstes = 0.0;
        for(Employee e : employees) {
            if (e.getSalary() >= hoechstes) {
                hoechstes = e.getSalary();
            }
        }for (Employee e : employees){
                if(hoechstes == e.getSalary()){
                    return e;
                }
            } return null;
    }

}

