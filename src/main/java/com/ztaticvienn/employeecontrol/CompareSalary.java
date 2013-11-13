package com.ztaticvienn.employeecontrol;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: Michail
 * Date: 07.11.13
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
public class CompareSalary implements Comparator{


    @Override
    public int compare(Object emp1, Object emp2) {
        return ((Employee) emp1).getAverageSalary().compareTo(((Employee) emp2).getAverageSalary());
    }


}
