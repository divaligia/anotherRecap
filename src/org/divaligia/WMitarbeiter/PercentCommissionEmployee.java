package org.divaligia.WMitarbeiter;

public class PercentCommissionEmployee extends Employee {
    protected double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname,
                                     String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        baseSalary *= 1.0 +percentCommission / 100;
        return baseSalary;
    }
}
