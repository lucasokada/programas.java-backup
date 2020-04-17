package com.br.domain.EmployeeTypes;

import com.br.domain.entities.Office;

public class Director extends Office {
    public Director(Double minSalary, Double maxSalary) {
        super(minSalary, maxSalary);
        this.officeName = "Director";
        this.officePosition = 5;
    }
}
