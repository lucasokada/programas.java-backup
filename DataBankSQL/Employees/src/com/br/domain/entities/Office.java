package com.br.domain.entities;

public class Office implements OfficesInterface{

    protected Double minSalary;
    protected Double maxSalary;
    protected int officePosition;
    protected String officeName;

    public Office(Double minSalary, Double maxSalary) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    //-----------------overrides-------------------------------------------------------------------
    @Override
    public boolean validateMinSalary(double salary) {
        return salary >= minSalary ? true : false;
    }

    @Override
    public boolean validateMaxSalary(double salary) {
        return salary <= maxSalary ? true : false;
    }

    @Override
    public String returnOfficeName() {
        return officeName;
    }

    //--------------------------------------------------------------------------------------------------
    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getOfficePosition() {
        return officePosition;
    }

    public String getOfficeName() {
        return officeName;
    }
}
