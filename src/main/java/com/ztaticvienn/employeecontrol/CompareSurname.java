package com.ztaticvienn.employeecontrol;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: Michail
 * Date: 07.11.13
 * Time: 21:08
 * To change this template use File | Settings | File Templates.
 */
public class CompareSurname implements Comparator {
    @Override
    public int compare(Object emp1, Object emp2) {
        return ((Employee) emp1).getSurname().compareTo(((Employee) emp2).getSurname());
    }
}
