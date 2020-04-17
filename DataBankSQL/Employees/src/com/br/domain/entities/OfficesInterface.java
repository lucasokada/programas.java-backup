package com.br.domain.entities;

import java.util.ArrayList;
import java.util.List;

public interface OfficesInterface {

    boolean validateMinSalary(double salary);
    boolean validateMaxSalary(double salary);
    String returnOfficeName();
}
