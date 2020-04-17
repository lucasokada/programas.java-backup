package com.br.domain.EmployeeTypes;

import com.br.domain.entities.Office;

public class Supervisor extends Office {


    public Supervisor(Double minSalary, Double maxSalary) {
        super(minSalary, maxSalary);
        this.officeName = "Supervisor";
        this.officePosition = 3;
    }
}
