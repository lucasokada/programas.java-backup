package com.br.domain.EmployeeTypes;

import com.br.domain.entities.Office;

public class Manager extends Office {
    public Manager(Double minSalary, Double maxSalary) {
        super(minSalary, maxSalary);
        this.officeName = "Manager";
        this.officePosition = 4;
    }
}
