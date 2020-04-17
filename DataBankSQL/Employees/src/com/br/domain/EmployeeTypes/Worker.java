package com.br.domain.EmployeeTypes;

import com.br.domain.entities.Office;

public class Worker extends Office {


    public Worker(Double minSalary, Double maxSalary) {
        super(minSalary, maxSalary);
        this.officeName = "Worker";
        this.officePosition = 1;
    }
}
