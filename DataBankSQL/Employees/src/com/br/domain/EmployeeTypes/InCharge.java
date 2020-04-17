package com.br.domain.EmployeeTypes;

import com.br.domain.entities.Office;

public class InCharge extends Office {

    public InCharge(Double minSalary, Double maxSalary) {
        super(minSalary, maxSalary);
        this.officeName = "InCharge";
        this.officePosition = 2;
    }
}
