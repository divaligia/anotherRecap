package org.divaligia.WMitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    protected ArrayList<Employee> empList = new ArrayList<>();

    public double calcTotalSalary(){
        double sum = 0.0;
        for(Employee e : empList){
            sum += e.getFullSalary();
        } return sum;
    }

    public void addEmployee(Employee e){
        empList.add(e);
    }

    public HashMap<String, Double> getSalarybyDepartment(){
        HashMap<String, Double> salByDep = new HashMap<>();
        double interimVal = 0.0;
        for(Employee e : empList){
            if (!salByDep.containsKey(e.department)) {
                interimVal += e.getFullSalary();
                salByDep.put(e.department, interimVal);
            } else interimVal += e.getFullSalary();
                salByDep.put(e.department, interimVal );
        } return salByDep;
    }

    public HashMap<String, Double> getSalaryByDepartment2()
    {
        HashMap<String, Double> dept = new HashMap<String, Double>();

        for(Employee e : empList)
        {
            if(dept.containsKey(e.department))
            {
                // already present
                double help = dept.get(e.department);
                dept.put(e.department, help + e.getFullSalary());
            }
            else
            {
                // new key
                dept.put(e.department, e.getFullSalary());
            }
        }

        return dept;
    }
}
