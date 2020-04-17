package com.br.domain.entities;

import java.util.Date;

public class Employees {
    private String name;
    private Double salary;
    private Date entryDate;
    private Office office;

    public Employees(String name, Double salary, Date entryDate, Office office) {
        this.name = name;
        this.salary = salary;
        this.entryDate = entryDate;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public OfficesInterface getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}

